package org.example;

public class Email {
    private String Email;

    //Constructor sin parametros
    public Email(){
        Email = "Null";
    }
    //Constructor con 1 parametro
    public Email(String email){
        this.Email = email;
    }
    //sets y gets
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }

    //Funcion para comprobar si usa el formato correcto

    public boolean esCorrecto(){

        char c, ultimo_c = this.Email.charAt(Email.length()-1);
        boolean tiene_a = false, tiene_p = false, escorrecto = false;
        int cont_a = 0;

        for(int i=0; i<this.Email.length(); i++){
            c = this.Email.charAt(i);
          if (c == '@'){
              tiene_a = true;
              cont_a += 1;
          }

          if (c == '.'){
              tiene_p = true;
          }
        }

        if (tiene_a == true && cont_a == 1 && tiene_p == true && ultimo_c != '.'){
            return escorrecto = true;
        } else {
            return escorrecto = false;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
