import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CalculatorMain {
    public static void main(String[] args) throws IOException {

        try {
            List<String> list = getListFromFile();
            List<BigDecimal> digitsList = getDigits(list);
            List<String> stringList = getStrings(list);
            BigDecimal num1 = digitsList.get(0);
            BigDecimal result = num1;
            for (int i = 1; i < stringList.size(); i++) {
                if (stringList.get(i).contains("add")) {
                    Context context = new Context(new OperationAdd());
                    result = context.executeStrategy(num1, digitsList.get(i));
                }
                if (stringList.get(i).contains("multiply")) {
                    Context context = new Context(new OperationMultiply());
                    result = context.executeStrategy(num1, digitsList.get(i));
                }
                if (list.get(i).contains("division")) {
                    Context context = new Context(new OperationDivision());
                    result = context.executeStrategy(num1, digitsList.get(i));
                }
                if (list.get(i).contains("substract")) {
                    Context context = new Context(new OperationSubstract());
                    result = context.executeStrategy(num1, digitsList.get(i));
                }
            }
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> getListFromFile() throws IOException {
        JFileChooser fileopen = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("c files", "c");
        fileopen.addChoosableFileFilter(filter);
        int ret = fileopen.showDialog(null, "Open file");
        File file;
        List<String> list = null;
        if (ret == JFileChooser.APPROVE_OPTION) {
            file = fileopen.getSelectedFile();
            list = Files.readAllLines(file.toPath(), Charset.defaultCharset());
            String tempStr = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(0, tempStr);
        }
        return list;
    }

    public static List<BigDecimal> getDigits(List<String> list) throws IOException {
        List<BigDecimal> listDigits = new ArrayList<BigDecimal>();
        for (int i = 0; i < list.size(); i++) {
            listDigits.add(new BigDecimal(list.get(i).replaceAll("\\D+", "")));
        }
        return listDigits;
    }

    public static List<String> getStrings(List<String> stringList) throws IOException {
        for (int i = 0; i < stringList.size(); i++) {
            String[] str = stringList.get(i).split(" ", 0);
            stringList.set(i, str[0]);
        }
        return stringList;
    }
}
