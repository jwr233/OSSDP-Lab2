import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    /*
     * @Description
     * 重复 DNA 序列
     * DNA 序列 由一系列核苷酸组成，缩写为 'A', 'C', 'G' 和 'T'.。
     * 例如，"ACGAATTCCG" 是一个 DNA 序列 。
     * 在研究 DNA 时，识别 DNA 中的重复序列非常有用。
     * 给定一个表示 DNA 序列 的字符串 s ，返回所有在DNA分子中出现不止一次的长度为10的序列(子字符串)。你可以按任意顺序返回答案。
     *
     *
     * 示例 1：
     * 输入：s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
     * 输出：["AAAAACCCCC","CCCCCAAAAA"]
     * 示例 2：
     * 输入：s = "AAAAAAAAAAAAA"
     * 输出：["AAAAAAAAAA"]
     */
    @org.junit.jupiter.api.Test
    void findRepeatedDnaSequences() {
        Solution sol = new Solution();
        List<String> testList = new ArrayList<String>();
        /* Test Strategy
            1、空字符串
            2、包含非法字符
            3、长度小于10的序列
            4、长度为10的序列
            5、长度大于10的序列 无重复子串
            6、~~~~~~~~~~~~~ 有一个重复子串
            7、~~~~~~~~~~~~~ 有多个重复子串
            8、长度11的字符串（边界条件
            9、长度20的字符串（边界条件
            10、全相同字符
         */
        assertEquals(testList,sol.findRepeatedDnaSequences(""));
        assertEquals(testList,sol.findRepeatedDnaSequences("ATG1234"));
        assertEquals(testList,sol.findRepeatedDnaSequences("ATGCGCTA"));
        assertEquals(testList,sol.findRepeatedDnaSequences("AAAACCCCCA"));
        assertEquals(testList,sol.findRepeatedDnaSequences("ACGTACGTACG"));
        testList.add("AAAAACCCCC");
        assertEquals(testList,sol.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCC"));
        testList.add("CCCCCAAAAA");
        assertEquals(testList,sol.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
        testList.clear();
        assertEquals(testList,sol.findRepeatedDnaSequences("ACGTACGTACGTA"));

        testList.add("ACGTACGTAC");testList.add("CGTACGTACG"); testList.add("GTACGTACGT"); testList.add("TACGTACGTA");

        assertEquals(testList,sol.findRepeatedDnaSequences("ACGTACGTACGTACGTACGTACGT"));
        testList.clear();
        testList.add("AAAAAAAAAA");
        assertEquals(testList,sol.findRepeatedDnaSequences("AAAAAAAAAAA"));
    }
}