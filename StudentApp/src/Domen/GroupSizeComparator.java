package Domen;

import java.util.Comparator;

public class GroupSizeComparator implements Comparator<StudentGroup> {

    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        if(o1.getGroup().size()==o2.getGroup().size())
        {
            if(o1.getGroup().size()==o2.getGroup().size())return 0 ;
            if(o1.getGroup().size()>o2.getGroup().size())return 1;
            else return -1;
            //return 0;
        }

        if(o1.getGroup().size()>o2.getGroup().size())
            return 1;
        else
            return -1;
    }

}