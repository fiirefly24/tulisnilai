/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tulisnilai;

import connection.connect_db;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Fikri
 */
public class tulis_session {
    private static String sessions;
    private static String roles;
    private static String id;
    private static String nama;
    private static String jk;
    private static String agama;
    private static String alamat;
    private static String tgl_lahir;
    private static String tempat_lahir;
    private static String id_kelas;
    private static String id_mapel;
 
    
    
    
    public static void setSession(String session, String role) {
        sessions = session;
        roles = role;
    }
    
    public static String getSessionID() {
        return sessions;
    }
    
    public static String getSessionRole() {
        return roles;
    }
    
    
     public static void main(String[] args){
        try {
            String login = "SELECT * FROM "+getSessionRole()+" WHERE id = '"+getSessionID()+"'";
            Statement connect = new connect_db().connect().createStatement();
            ResultSet result = connect.executeQuery(login);
            ArrayList<tulis_session> listsession = new ArrayList<tulis_session>();
            if (result.next()){
                if ("guru".equals(getSessionRole())) {
                    tulis_session session = new tulis_session();
                    session.setID(result.getString("id"));
                    session.setNama(result.getString("nama"));
                    session.setJk(result.getString("jk"));
                    session.setAgama(result.getString("agama"));
                    session.setAlamat(result.getString("alamat"));
                    session.setTglLahir(result.getString("tgl_lahir"));
                    session.setTempatLahir(result.getString("tmp_lahir"));
                    session.setKelas(result.getString("id_kelas"));
                    session.setMapel(result.getString("id_matapelajaran"));
                    System.out.println("Berhasil");
                    System.out.println();
                } else {
                }
            
            
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    
    
    // Getter dan Setter untuk atribut Siswa

    public String getId() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }
    
    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }
    
    public String getTglLahir() {
        return tgl_lahir;
    }

    public void setTglLahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }
    
    public String getTempatLahir() {
        return tempat_lahir;
    }

    public void setTempatLahir(String tempat_lahir) {
        this.tempat_lahir = tempat_lahir;
    }
    
    public String getKelas() {
        return id_kelas;
    }

    public void setKelas(String id_kelas) {
        this.id_kelas = id_kelas;
    }
    
    public String getMapel() {
        return id_mapel;
    }

    public void setMapel(String id_mapel) {
        this.id_mapel = id_mapel;
    }
    

    // Override method toString untuk menampilkan data Siswa
    @Override
    public String toString() {
        return "tulis_session [id=" + id + ", nama=" + nama + ", alamat=" + alamat + ", jk=" + jk + ",agama=" + agama + ",tgl_lahir=" + tgl_lahir + ",tempat_lahir=" + tempat_lahir + ",id_kelas=" + id_kelas + ",id_mapel=" + id_mapel + ", roles="+roles+"]";
    }
}
