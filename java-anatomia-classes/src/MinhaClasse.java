public class MinhaClasse {
    
    public static void main(String [] args) {
        
        String primeiroNome = "Leandro";
        String nomeDoMeio = "Ribeiro";
        String sobreNome = "Vieira";
        String nomeCompleto = nomeCompleto (primeiroNome,nomeDoMeio,sobreNome);

        System.out.println(nomeCompleto);
      
    }

 public static String nomeCompleto
    (String primeiroNome,String nomeDoMeio,String sobreNome) {
        return "segue nome completo = " + primeiroNome.concat(" ").concat(nomeDoMeio).concat(" ").concat(sobreNome);
 }
}
