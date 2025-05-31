public class CPF {
    

    public  void validarCpf(String cpf){
        cpf = cpf.replaceAll("[\\.-]", "");

        if(cpf.length() != 11){
            throw new IllegalArgumentException("CPF inválido");
        }

        int aux = 0;

        for(int x = 0; x < 9; x++){
            String p = "" + cpf.charAt(x);
            int y = Integer.parseInt(p);
            aux = aux + y * (10 - x);
            
        }

        int resto1 = aux % 11;
        int verificador1 = 11 - resto1;
        String p1 = "" + cpf.charAt(9);
        int m1 = Integer.parseInt(p1);


        aux = 0;
        for(int x = 0; x < 10; x++){
            String p = "" + cpf.charAt(x);
            int y = Integer.parseInt(p);
            aux = aux + y * (11 - x);
            
        }

        int resto2 = aux % 11;
        int verificador2 = 11 - resto2;
        String p2 = "" + cpf.charAt(9);
        int m2 = Integer.parseInt(p2);

        if(verificador1 != m1 && verificador2 != m2){
            
            throw new IllegalArgumentException("CPF inválido");
        }
    }

}