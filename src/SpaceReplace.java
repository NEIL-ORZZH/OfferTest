/**
 * Created by toryang on 16/3/8.
 */

/**
 * 题目描述:
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *
 */
public class SpaceReplace {
    /**
     * 每个char进行遍历
     *
     * @param stringBuffer
     * @return
     */
    public static String replaceReplace(StringBuffer stringBuffer){
        StringBuffer out = new StringBuffer();
        for (int i = 0;i<stringBuffer.toString().length();i++){
            char b = stringBuffer.charAt(i);
            if (String.valueOf(b).equals(" ")){
                out.append("%20");
            }else {
                out.append(b);
            }
        }
        return out.toString();
    }

    /**
     * 直接使用函数
     * @param str
     * @return
     */
    public static String replace(StringBuffer str){
        return str.toString().replaceAll("\\s","%20");
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("hello world.");
        System.out.println(replaceReplace(str));
        System.out.println(replace(str));
    }
}
