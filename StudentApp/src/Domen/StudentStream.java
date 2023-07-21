package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup>{
    private List<StudentGroup> studentStream;
    private Integer idStream;

    public StudentStream(List<StudentGroup> studentStream, Integer idStream){
        this.studentStream=studentStream;
        this.idStream=idStream;
    }


    public List<StudentGroup> getStudentStream() {
        return studentStream;
    }

    public void setStudentStream(List<StudentGroup> studentStream) {
        this.studentStream = studentStream;
    }

    public Integer getIdStream() {
        return idStream;
    }

    public void setIdStream(Integer idStream) {
        this.idStream = idStream;
    }

    @Override
    public String toString() {
            return "idStream:" + idStream+ "\n"+ "Groups Amount: " + studentStream.size() +
                    "\n" + studentStream + '}';
    }


    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {

            private int counter;

            @Override
            public boolean hasNext() {

                if(counter<studentStream.size())
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }

            @Override
            public StudentGroup next() {
                return studentStream.get(counter++);
            }

        };
    }


    }

