import java.util.ArrayList;

public class IntegerSet {

    ArrayList<Integer> Numbers ;// Rep

    // Abstraction Function (AF):
    // - AF (Numbers) = the set of integers in the Integer x.
    //
    // Rep Invariant (RI):
    // - Numbers must not contain null and duplicate integers.
    // - integers in Numbers must be sorted in ascending order.

    public IntegerSet() {
        Numbers = new ArrayList<>() ;
        CheckRep() ;

    }

    /**
     * ตรวจสอบว่า Rep Invariant เป็นจริงหรือไม่
     */
    public void CheckRep() {
        for (int i = 0; i < Numbers.size() - 1; i++) {
            if (Numbers == null) {
                throw new RuntimeException("Rep invariant violated!");
            }
            
            if (Numbers.get(i) >= Numbers.get(i+1)) {
                throw new RuntimeException("Rep invariant violated!");
            }
        }
    }

    /**
     * เพิ่มตัวเลขเข้าเซต
     * @param x ตัวเลขที่ต้องการเพิ่ม
     */
    public void add(Integer x) {
        if (!this.contains(x)) {
            int i = 0 ;
            while (i < Numbers.size() && Numbers.get(i) < x) {
                i++;
            }
            Numbers.add(i, x) ;
        }
        CheckRep();
    }

    /**
     * ลบตัวเลขออกจากเซต
     * @param x ตัวเลขที่ต้องการลบ
     */
    public void remove(Integer x) {
        int index = Numbers.indexOf(x);
        if (index != -1) {
            Numbers.remove(index) ;
        }
        CheckRep(); 
    }

    /**
     * ตรวจสอบว่ามีตัวเลขนี้อยู่ในเซตหรือไม่
     * @param x เลขที่ต้องการตรวจสอบ
     * @return true หากมี x อยู่ในเซต, false หากไม่มี
     */
    public boolean contains(Integer x) {
        return Numbers.indexOf(x) != -1;
    }

    /**
     * คืนค่าขนาดของเซต
     * @return จำนวนสมาชิกในเซต
     */
    public int size() {
        return Numbers.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < Numbers.size(); i++) {
            sb.append(Numbers.get(i));
            if (i < Numbers.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString() ;
        }

    }
