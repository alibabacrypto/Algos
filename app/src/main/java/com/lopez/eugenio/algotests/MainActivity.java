package com.lopez.eugenio.algotests;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lopez.eugenio.algotests.Algos.Binary;

public class MainActivity extends AppCompatActivity {


    //int listSize = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Binary binary = new Binary();
        binary.flipImage();
       // binary.hammingDistance();

        //orignal way of building the list
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        List<Heading> headings = new ArrayList<>();
//        for (String line = br.readLine(); line != null; line = br.readLine()) {
//            headings.add(parse(line));
//        }

//        List<Heading> headings = new ArrayList<>();
//        headings.add(parse("H1 All About Birds"));
//        headings.add(parse("H2 Kinds of Birds"));
//        headings.add(parse("H3 The Finch"));
//        headings.add(parse("H3 The Swan"));
//        headings.add(parse("H2 Habitats"));
//        headings.add(parse("H3 Wetlands"));
//        listSize = headings.size();
//        Node outline = toOutline(headings);
//        String html = toHtml(outline);
//        System.out.println(html);

    }


//    private static Node toOutline(List<Heading> headings) {
//        // Implement this function. Sample code below builds an
//        // outline of only the first heading.
//
//
//
//        Node root = new Node(new Heading(0, ""));
//
//        root.children.add(new Node(headings.get(0)));
//        root.children.add(new Node(headings.get(1)));
//        root.children.add(new Node(headings.get(2)));
//        root.children.add(new Node(headings.get(3)));
//        root.children.add(new Node(headings.get(4)));
//        root.children.add(new Node(headings.get(5)));
//
//        return root;
//    }
//
//    /** Parses a line of input.
//     This implementation is correct for all predefined test cases. */
//    private static Heading parse(String record) {
//        String[] parts = record.split(" ", 2);
//        int weight = Integer.parseInt(parts[0].substring(1));
//        Heading heading = new Heading(weight, parts[1].trim());
//        return heading;
//    }
//
//    /** Converts a node to HTML.
//     This implementation is correct for all predefined test cases. */
//    private static String toHtml(Node node) {
//        StringBuilder buf = new StringBuilder();
//        if (!node.heading.text.isEmpty()) {
//            buf.append(node.heading.text);
//            buf.append("\n");
//        }
//        Iterator<Node> iter = node.children.iterator();
//        if (iter.hasNext()) {
//            buf.append("<ol>");
//
//            while (iter.hasNext()) {
//                Node child = iter.next();
//                buf.append("<li>");
//                buf.append(toHtml(child));
//                buf.append("</li>");
//                if (iter.hasNext()) {
//                    buf.append("\n");
//                }
//            }
//            buf.append("</ol>");
//        }
//        return buf.toString();
//    }
//
//    public static class Heading {
//        protected int weight;
//        protected String text;
//
//        public Heading(int weight, String text) {
//            this.weight = weight;
//            this.text = text;
//        }
//    }
//    public static class Node {
//        protected Heading heading;
//        protected List<Node> children;
//
//        public Node(Heading heading) {
//            this.heading = heading;
//            this.children = new ArrayList<>();
//        }
//    }
//
//}
////input
////    H1 All About Birds
////    H2 Kinds of Birds
////    H3 The Finch
////        H3 The Swan
////        H2 Habitats
////        H3 Wetlands
////        Your Output
//
////expected output
////<ol><li>All About Birds
////<ol><li>Kinds of Birds
////<ol><li>The Finch
////</li>
////<li>The Swan
////</li></ol></li>
////<li>Habitats
////<ol><li>Wetlands
////</li></ol></li></ol></li></ol>
//
////my more readable version
////<ol>
//// <li>All About Birds
////<ol>
//// <li>Kinds of Birds
////<ol>
//// <li>The Finch
////</li>
////<li>The Swan
////</li></ol></li>
////<li>Habitats
////<ol>
//// <li>Wetlands
////</li></ol></li></ol></li></ol>
}
