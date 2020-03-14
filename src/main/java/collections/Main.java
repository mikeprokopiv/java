package src.main.java.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        InitClass first = new InitClass.Builder(1, "John", "Smith", new int[]{1, 2, 3, 4},
                new String[]{"Math", "Chemistry", "English", "Biology"}, true)
                .build();
        InitClass second = new InitClass.Builder(2, "Tom", "Berkley", new int[]{2, 3, 3, 4},
                new String[]{"Math", "Geography", "English", "Citizenship"}, false)
                .build();
        InitClass third = new InitClass.Builder(3, "Timothy", "McGee", new int[]{1, 2, 4, 4},
                new String[]{"History", "Chemistry", "English", "Biology"}, true)
                .build();
        InitClass fourth = new InitClass.Builder(4, "Jetro", "Gibbs", new int[]{1, 2, 3, 6},
                new String[]{"Math", "Chemistry", "Literacy", "Biology"}, false)
                .build();
        InitClass fifth = new InitClass.Builder(5, "Antony", "Dinosso", new int[]{1, 2, 5, 4},
                new String[]{"Music", "Chemistry", "English", "Biology"}, true)
                .build();
        InitClass same = new InitClass.Builder(6, "Jack", "Smith", new int[]{1, 2, 3, 4},
                new String[]{"Math", "Chemistry", "English", "Biology"}, true)
                .build();

        //ArrayList
        List<InitClass> al = new ArrayList<>();
        al.add(first);
        al.add(second);
        al.add(third);
        al.add(fourth);
        al.add(fifth);

//        Iterator itr = al.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }

        //LinkedList
        List<InitClass> ll = new LinkedList<>();
        ll.add(first);
        ll.add(second);
        ll.add(third);
        ll.add(fourth);
        ll.add(fifth);

//        Iterator itr1 = ll.iterator();
//        while (itr1.hasNext()) {
//            System.out.println(itr1.next());
//        }

        //HashSet
        Set<InitClass> hs = new HashSet<>();
        hs.add(first);
        hs.add(second);
        hs.add(third);
        hs.add(fourth);
        hs.add(fifth);

//        Iterator itr2 = hs.iterator();
//        while (itr2.hasNext()) {
//            System.out.println(itr2.next());
//        }

        //TreeSet(error)
        Set<InitClass> ts = new TreeSet<>(new Comparator<InitClass>() {
            @Override
            public int compare(InitClass initClass, InitClass t1) {
                if (initClass == t1 || (initClass != null && initClass.equals(t1))) {
                    return 0;
                }
                return initClass.getName().compareTo(t1.getName());
            }
        });
        ts.add(fifth);
        ts.add(third);
        ts.add(second);
        ts.add(fifth);
        ts.add(same);
        ts.add(first);

        Iterator<InitClass> itr3 = ts.iterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next());
        }

        //HashMap
        Map<Integer, InitClass> hm = new HashMap<>();
        hm.put(2, second);
        hm.put(3, third);
        hm.put(1, fifth);
        hm.put(5, first);
        hm.put(4, fourth);

//        for (Map.Entry<Integer, InitClass> entry : hm.entrySet()) {
//            int key = entry.getKey();
//            InitClass b = entry.getValue();
//            System.out.println(key + " Details:");
//            System.out.println("number = " + b.getNumber() +
//                    ", name - " + b.getName() +
//                    ", surname - " + b.getSurname() +
//                    ", marks = " + Arrays.toString(b.getMarks()) +
//                    ", subjects = " + Arrays.toString(b.getSubjects()) +
//                    ", firstYearStudent = " + b.isFirstYearStudent());
//        }
    }
}