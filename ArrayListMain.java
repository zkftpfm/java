// Collection API
// List(중복허용, 순서존재, 객체를 요소로 갖는다, 가변길이)
// Set(중복허용안함, 순서없음, 객체를 요소로 갖는다, 가변길이)
// 
// Map({key : value} 가지고 있는 자료구조)

// Wrapper Class : int -> Integer, boolean -> Boolean
// boxing, unboxing

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import siat.study.oop.domain.constructor.ManagerVO;
import siat.study.oop.domain.constructor.PersonVO;
import siat.study.oop.domain.constructor.StudentVO;
import siat.study.oop.domain.constructor.TeacherVO;

public class ArrayListMain {
    public static void main(String[] args) {
        // Array

        System.out.println(">>>> Array");
        int [] ary = new int[5] ;
        ary[0] = 10 ;ary[1] = 20 ;ary[2] = 30 ;ary[3] = 40 ;ary[4] = 50 ;
        System.out.println("length = "+ary.length);
        ary[2] = 0 ;
        System.out.println(Arrays.toString(ary));

        System.out.println(">>>> List");
        List lst = new Vector() ;
        lst.add(new StudentVO());
        lst.add("jslim");
        lst.add(1);
        lst.add(true);
        System.out.println("length = "+lst.size());
        lst.remove(0);
        System.out.println("length = "+lst.size());
        System.out.println("get = "+lst.get(0));

        System.out.println(">>> ");
        List<String> strLst = new ArrayList<String>() ;
        strLst.add("siat"); strLst.add("doremi");

        // //////

        List<PersonVO> perLst = new ArrayList<PersonVO>();
        perLst.add(new StudentVO("jslim", "seoul", "2018"));
        perLst.add(new TeacherVO("jslim", "seoul", "java"));
        perLst.add(new ManagerVO("jslim", "seoul", "sales"));

        for(int idx=0; idx < perLst.size(); idx++) {
            PersonVO obj = perLst.get(idx);
            System.out.println(obj.perInfo());
        }
        System.out.println(">>>> enhanced loop");
        for(PersonVO entity : perLst) {
            System.out.println(entity.perInfo());
        }

        System.out.println(">>>> Iterator");
        Iterator<PersonVO> ite = perLst.iterator();
        while (ite.hasNext()) {
            PersonVO per = ite.next() ;
            System.out.println(per.perInfo());
            
        }
    }
}
