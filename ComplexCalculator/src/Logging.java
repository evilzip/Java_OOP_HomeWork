import java.io.FileWriter;
import java.io.IOException;

/**
 * Класс для логгирования
 */
public class Logging {
    private String fileName;

    public Logging(String fileName){
        this.fileName=fileName;
    }

    /**
     * Метод записи лог событя в файл
     * @param message - текст записываемы в лог
     */
    public void log(String message){
       try {
           FileWriter writer = new FileWriter(fileName, true);
           writer.write(message+"\n");
           writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    /**
     * метод очистки лог файла
     */
    public void clear(){
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
