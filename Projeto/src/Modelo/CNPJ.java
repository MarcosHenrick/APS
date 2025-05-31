public class CNPJ {

    public void verificarCNPJ(String CNPJ){
        
        CNPJ = CNPJ.replaceAll("[\\/.-]", "");
             
        int [] x1 = {5,4,3,2,9,8,7,6,5,4,3,2};
        int [] x2 = {6,5,4,3,2,9,8,7,6,5,4,3,2};

        int aux = 0;


        for(int i = 0; i < 11; i++){

            String p = "" + CNPJ.charAt(i);
            int y = Integer.parseInt(p);
            aux = aux + y * x1[i];

        }

        int resto1 = aux % 11;
        int verificador1 = 11 - resto1;
        String p1 = "" + CNPJ.charAt(12);
        int m1 = Integer.parseInt(p1);
        if(m1 < 2){
            m1 = 0;
        }


        aux = 0;
        for(int i = 0; i < 12; i++){

            String p = "" + CNPJ.charAt(i);
            int y = Integer.parseInt(p);
            aux = aux + y * x2[i];

        }

        int resto2 = aux % 11;
        int verificador2 = 11 - resto2;
        String p2 = "" + CNPJ.charAt(13);
        int m2 = Integer.parseInt(p2);
        if(m2 < 2){
            m2 = 0;
        }

        if(verificador1 != m1 && verificador2 != m2){
            throw new IllegalArgumentException("CNPJ inválido");
        }
    }
    
}
