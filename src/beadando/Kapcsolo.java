/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beadando;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author zbocskay
 */
public class Kapcsolo {
    protected int id;
    protected int userId;
    protected int kajaId;
    protected int napszakId;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyy/mm/dd");
    protected Date date = new Date();
}
