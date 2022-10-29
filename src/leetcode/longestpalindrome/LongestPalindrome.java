package leetcode.longestpalindrome;

public class LongestPalindrome {
    public static void main(String[] args) {

//        Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
//
//        Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
//        "abccccdd"
//        "babad"

        System.out.println(longestPalindrome("aaaaaaaabt"));
//        System.out.println(longestPalindrome("ibvjkmpyzsifuxcabqqpahjdeuzaybqsrsmbfplxycsafogotliyvhxjtkrbzqxlyfwujzhkdafhebvsdhkkdbhlhmaoxmbkqiwiusngkbdhlvxdyvnjrzvxmukvdfobzlmvnbnilnsyrgoygfdzjlymhprcpxsnxpcafctikxxybcusgjwmfklkffehbvlhvxfiddznwumxosomfbgxoruoqrhezgsgidgcfzbtdftjxeahriirqgxbhicoxavquhbkaomrroghdnfkknyigsluqebaqrtcwgmlnvmxoagisdmsokeznjsnwpxygjjptvyjjkbmkxvlivinmpnpxgmmorkasebngirckqcawgevljplkkgextudqaodwqmfljljhrujoerycoojwwgtklypicgkyaboqjfivbeqdlonxeidgxsyzugkntoevwfuxovazcyayvwbcqswzhytlmtmrtwpikgacnpkbwgfmpavzyjoxughwhvlsxsgttbcyrlkaarngeoaldsdtjncivhcfsaohmdhgbwkuemcembmlwbwquxfaiukoqvzmgoeppieztdacvwngbkcxknbytvztodbfnjhbtwpjlzuajnlzfmmujhcggpdcwdquutdiubgcvnxvgspmfumeqrofewynizvynavjzkbpkuxxvkjujectdyfwygnfsukvzflcuxxzvxzravzznpxttduajhbsyiywpqunnarabcroljwcbdydagachbobkcvudkoddldaucwruobfylfhyvjuynjrosxczgjwudpxaqwnboxgxybnngxxhibesiaxkicinikzzmonftqkcudlzfzutplbycejmkpxcygsafzkgudy"));
    }

    private static String longestPalindrome(String input) {
        if(input==null || input.length()<1)return "";

        int start = 0;
        int end = 0;

        for(int i=0;i<input.length();i++) {
            int len1 = expandFromMiddle(input,i,i);
            int len2 = expandFromMiddle(input,i,i+1);
            int len = Math.max(len1,len2);

            if(len > end-start) {
                start = i - ((len-1)/2);
                end = i + (len/2);
            }
        }

        return input.substring(start,end+1);
    }

    private static int expandFromMiddle(String input,int left,int right) {
        if(input == null || left > right) return 0;

        while(left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)) {
            left--;
            right++;
        }

        return right-left-1;
    }
}
