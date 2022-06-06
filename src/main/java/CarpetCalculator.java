import java.text.NumberFormat;
import java.util.ArrayList;

public class CarpetCalculator implements Calculatable {
    //datamembers
    Float pricePerSqFt;
    Float installCharge;
    ArrayList<Integer> roomList = new ArrayList<Integer>();
    float total;
    float hundred = 100;
    float discount;

    //constructors
    public CarpetCalculator(Float pricePerSqFt) {
        this.pricePerSqFt = pricePerSqFt;
    }

    public CarpetCalculator(Float pricePerSqFt, Float installCharge) {
        this.pricePerSqFt = pricePerSqFt;
        this.installCharge = installCharge;
    }

    //methods
    public Integer areaSum() {
        int sum = 0;
        for (int s : roomList) {
            sum += s;
        }
        return sum;
    }

    //overrides
    @Override
    public void addRoom(Room room) {
        roomList.add(room.length * room.width);
        //System.out.println(roomList);
    }

    @Override
    public String getTotalCost() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        if (!(installCharge == null)) {
            total = (pricePerSqFt * areaSum()) + installCharge;
        } else
            total = (pricePerSqFt * areaSum());
        return fmt.format(total - discount);
    }
    @Override
    public void addPercentDiscount(float percentDiscount) {
        float t = (pricePerSqFt * areaSum()) + installCharge;
        if (percentDiscount > 0) {
            discount = (percentDiscount / hundred * t);
        }
    }
}

