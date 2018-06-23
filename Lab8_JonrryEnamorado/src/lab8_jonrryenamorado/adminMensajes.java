/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_jonrryenamorado;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author wende
 */
public class adminMensajes implements Serializable {
    ArrayList<mensajes> listaMensajes = new ArrayList();
    private File archivo = null;
   
    
     private static final long SerialVersonUID = 777L;
    
    public adminMensajes(String path) {
        archivo = new File(path);
    }

    public ArrayList<mensajes> getListaMensajes() {
        return listaMensajes;
    }

    public void setListaMensajes(ArrayList<mensajes> listaMensajes) {
        this.listaMensajes = listaMensajes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setMensaje(mensajes a){
        listaMensajes.add(a);
    }
    
    public void cargarArchivo() {
        try {
            listaMensajes = new ArrayList();
            mensajes temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo) ;
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp = (mensajes)objeto.readObject()) != null){
                        listaMensajes.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                
            objeto.close();
            entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (mensajes t : listaMensajes) {
                bw.writeObject(t);
            }
        } catch (Exception e) {
        }finally{
            try {
                
        fw.close();
                bw.close();
            } catch (Exception ex) {
            }
    }
    }
    
}
