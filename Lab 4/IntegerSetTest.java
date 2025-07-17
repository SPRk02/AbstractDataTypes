public class IntegerSetTest {
    public static void main(String[] args) {
        System.out.println("--- Starting IntegerSet Manual Tests ---");
        int passed = 0;
        int failed = 0;

        // Test 1: การสร้าง, เพิ่มข้อมูล, และการเรียงลำดับ
        System.out.println("\n--- Testing add() and sorting ---");
        IntegerSet a = new IntegerSet();
        a.add(50);
        a.add(70);
        a.add(90);
        String expected1 = "{50, 70, 90}";
        if (a.toString().equals(expected1)) {
            System.out.println("PASSED: Add and sort works correctly.");
            passed++;
        } else {
            System.out.println("FAILED: Expected " + expected1 + " but got " + a.toString());
            failed++;
        }

        // Test 2: การเพิ่มข้อมูลที่ซ้ำซ้อน
        System.out.println("\n--- Testing adding duplicates ---");
        a.add(50); // เพิ่ม 50 ที่มีอยู่แล้ว
        if (a.size() == 3) {
            System.out.println("PASSED: Adding a duplicate does not change the size.");
            passed++;
        } else {
            System.out.println("FAILED: Size should be 3 but got " + a.size());
            failed++;
        }

        // Test 3: การลบข้อมูล
        System.out.println("\n--- Testing remove() ---");
        a.remove(70);
        String expected2 = "{50, 90}" ;
        if (a.toString().equals(expected2)) {
            System.out.println("PASSED: Remove works correctly.");
            passed++;
        } else {
            System.out.println("FAILED: Expected " + expected2 + " but got " + a.toString());
            failed++;
        }

        // Test 4: การตรวจสอบข้อมูล (contains)
        System.out.println("\n--- Testing contains() ---");
        if (a.contains(50) && !a.contains(70)) {
            System.out.println("PASSED: Contains works correctly after removal.");
            passed++;
        } else {
            System.out.println("FAILED: Contains check is incorrect.");
            failed++;
        }

        // --- สรุปผล ---
        System.out.println("\n--------------------");
        System.out.println("--- Test Summary ---");
        System.out.println("Passed: " + passed + ", Failed: " + failed);
        if (failed == 0) {
            System.out.println("Excellent! All tests passed!");
        } else {
            System.out.println("Some tests failed.");
        }
    }
} 

