public class MaquinaLavar {

    public void lavarRoupa() {
        System.out.println("LAVANDO A ROUPA.");
    }

    public void centrifugarRoupa() {
        System.out.println("CENTRIFUGANDO A ROUPA.");
    }

    public void secarRoupa() {
        System.out.println("SECANDO A ROUPA.");
    }

    public void ligarMaquina(Boolean ligarMaquina) {
        if (ligarMaquina == true) {
            System.out.println("VOCÊ LIGOU A MÁQUINA DE LAVAR.");
        } else {
            System.out.println("A MÁQUINA DE LAVAR ESTÁ DESLIGADA.");
        }
    }

    public void desligarMaquina(Boolean desligarMaquina) {
        if (desligarMaquina == true) {
            System.out.println("VOCÊ DESLIGOU A MÁQUINA DE LAVAR.");
        } else {
            System.out.println("A MÁQUINA PERMANECE LIGADA.");
        }
    }
}