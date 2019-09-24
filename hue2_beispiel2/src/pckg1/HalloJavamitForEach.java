/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckg1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */
public class HalloJavamitForEach {
    public HalloJavamitForEach (List<String> liste) {
        liste.forEach((String s) -> System.out.println(s));
    }
}
