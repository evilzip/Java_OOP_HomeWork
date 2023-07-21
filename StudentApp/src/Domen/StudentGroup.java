package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> group;
    private Integer idGroup;

    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

     @Override
    public String toString() {
        return "StudentGroup{" + "idGroup=" + idGroup+ ",  "+ "Student Amount=" + group.size()+",  "+
                group + "}";
    }

    @Override
    public Iterator<Student> iterator() {
       return new Iterator<Student>() {

        private int counter;

        @Override
        public boolean hasNext() {

            if(counter<group.size())
            {
                return true;
            }
            else
            {
                return false;
            }            
        }

        @Override
        public Student next() {            
            return group.get(counter++);
        }
        
       };
        
    }

    @Override
    public int compareTo(StudentGroup o) {
        if(this.idGroup==o.idGroup)
        {
            if(idGroup==o.idGroup)return 0 ;
            if(idGroup>o.idGroup)return 1;
            else return -1;
            //return 0;
        }

        if(this.idGroup>o.idGroup)
            return 1;
        else
            return -1;
    }
}