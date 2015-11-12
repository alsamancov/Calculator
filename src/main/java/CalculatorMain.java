import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CalculatorMain {
    public static void main(String[] args) throws IOException {
        List<String> list = getListFromFile();
        ArrayList<Integer> digitsList = getDigits(list);
        List<String> stringList = getStrings(list);

        int num1 = digitsList.get(0);
        int result = num1;
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
    }

    public static List<String> getListFromFile() throws IOException {
        File file = new File("c:\\task\\source3.txt");
        List<String> list = Files.readAllLines(file.toPath(), Charset.defaultCharset());
        String tempStr = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        list.add(0, tempStr);
        return list;
    }

    public static ArrayList<Integer> getDigits(List<String> list) throws IOException {
        ArrayList<Integer> listDigits = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            listDigits.add(Integer.parseInt(list.get(i).replaceAll("\\D+", "")));
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
