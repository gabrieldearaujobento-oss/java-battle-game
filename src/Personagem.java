public class Personagem {
    private String name;
    private int life;
    private int damage;
    private boolean alive;

    public Personagem(int life, boolean alive) {
        this.life = life;
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setName(String name) {this.name = name;}

    public void setLife(int life) {this.life = life;}

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void atacar(Personagem enemy) {
        System.out.println("\n" + name + " atacou " + enemy.getName() + " e causou " + damage + " de dano!");
        enemy.receberDano(this.damage);
    }

    public void receberDano (int damage) {
        life -= damage;

        if(life <= 0 ) {
            life = 0;
            alive = false;
            System.out.println(name + " recebeu " + damage + " de dano.");
            System.out.println("Vida restante: " + life);
            System.out.println(name + " foi derrotado!");
        }
    }

    public void mostrarStatus() {
        System.out.println("Nome: " + name);
        System.out.println("Vida atual: " + life);
        System.out.println("Status: " + (alive ? "Vivo" : "Derrotado"));
        System.out.println("----------------------");
    }
}
