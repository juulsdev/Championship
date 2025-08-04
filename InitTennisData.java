
/**
 * The Class InitTennisData.
 */
public class InitTennisData {

    /**
     * Instantiates a new inits the tennis data.
     *
     * @param championship the championship
     */
    public InitTennisData() {
        // Descomentar la carga de datos que se quiera probar
        cargarDatos1();// Produce la salida Salida1_EC2
        //        cargarDatos2();// Produce la salida Salida2_EC2
        //        cargarDatos3();// Produce una salida err�nea

    }

    /**
     * Cargar datos 1.
     *
     * @param championship the championship
     *
     */
    private void cargarDatos1() {
        Logger.getInstance().addOutputClass(new ConsoleOutput());
        Logger.getInstance().addOutputClass(new FileOutput("Salida1.txt"));
        Championship championship = Championship.getInstance();
        championship.setName("Campeonato de Extremadura");
        // Inicializamos los datos necesarios
        Racket.initializeMaps();

        // Instanciamos 8 zapatillas: (Los parámetros están en el orden: tipo, modelo,
        // número y valor)
        Shoes z1 = new Damped("Air Zoom Vapor Pro", 42, 5);
        Shoes z2 = new WithGrip("Court Vapor React", 40, 5);
        Shoes z3 = new WithGrip("Gel-Resolution 8 GS", 40, 4);
        Shoes z4 = new Damped("Vapor Lite", 42, 3);
        Shoes z5 = new WithGrip("Court Lite", 39, 3);
        Shoes z6 = new Damped("UberSonic 4K", 40, 6);
        Shoes z7 = new Damped("Zoom GP Turbo", 43, 3.5);
        Shoes z8 = new WithGrip("CourtJam Bounce", 42, 3.5);

        // Instanciamos 8 tenistas: (Los parámetros están en el orden nombre,
        // zapatillas, saque, resto, ranking, pais)
        TennisPlayer t1 = new PickguardPlayer("Novak Djokovic", z1, 90.0, 80.0, 1, "Serbia", 42);
        TennisPlayer t2 = new PickguardPlayer("Ashleigh Barty", z2, 70.0, 80.0, 1, "Australia", 40);
        TennisPlayer t3 = new VolleyerPlayer("Stefanos Tsitsipas", z7, 55.0, 48.0, 3, "Grecia", 43);
        TennisPlayer t4 = new VolleyerPlayer("Karolina Pliskova", z5, 67.0, 68.5, 3, "Rep Checa", 39);
        TennisPlayer t5 = new PickguardPlayer("Elina Svitolina", z6, 55.5, 68.5, 4, "Ucrania", 40);
        TennisPlayer t6 = new PickguardPlayer("Alexander Zverev", z8, 59.0, 49.5, 4, "Alemania", 42);
        TennisPlayer t7 = new VolleyerPlayer("Aryna Sabalenka", z3, 67.5, 79.5, 2, "Bielorrusia", 40);
        TennisPlayer t8 = new VolleyerPlayer("Daniil Medvedev", z4, 79.0, 68.0, 2, "Rusia", 42);

        // A continuación se inscribirán a los 8 tenistas en el campeonato
        t1.enroll();
        t2.enroll();
        t3.enroll();
        t4.enroll();
        t5.enroll();
        t6.enroll();
        t7.enroll();
        t8.enroll();

        // Instanciamos zapatillas para ser usadas en el campeonato:
        // (Los parámetros están en el orden: tipo, modelo, número y valor)
        Shoes z9 = new Damped("Lotto Space", 40, 5);
        Shoes z10 = new Damped("K-Swiss Express", 42, 3);
        Shoes z11 = new Damped("Babolat Jet Tere", 42, 5.5);
        Shoes z12 = new Damped("Lotto Mirage", 40, 6);
        Shoes z13 = new Damped("K-Swiss Hypercourt", 40, 5);
        Shoes z14 = new Damped("Wilson Rush", 42, 3.5);
        Shoes z15 = new Damped("Head Revolt", 40, 5);
        Shoes z16 = new WithGrip("Joma Slam", 40, 3);
        Shoes z17 = new WithGrip("Adidas Gamecourt", 40, 5);
        Shoes z18 = new WithGrip("Asics Gel-Game", 42, 4.5);
        Shoes z19 = new WithGrip("Asics Solution", 42, 3);
        Shoes z20 = new WithGrip("Nike Air Zoom", 40, 5);
        Shoes z21 = new WithGrip("Nike Zoom Vapor", 42, 4);
        Shoes z22 = new WithGrip("Wilson Kaos", 41, 5);
        Shoes z23 = new WithGrip("Head Revolt Pro", 42, 4.5);

        championship.shoesList(z9);
        championship.shoesList(z10);
        championship.shoesList(z11);
        championship.shoesList(z12);
        championship.shoesList(z13);
        championship.shoesList(z14);
        championship.shoesList(z15);
        championship.shoesList(z16);
        championship.shoesList(z17);
        championship.shoesList(z18);
        championship.shoesList(z19);
        championship.shoesList(z20);
        championship.shoesList(z21);
        championship.shoesList(z22);
        championship.shoesList(z23);

        // Instanciamos raquetas para ser usadas en el campeonato:
        // (Los parámetros están en el orden: Modelo, peso, longitud, tamaño de
        // cabeza,
        // tipo de encordado)
        // Además en el caso de raquetas equilibradas también se indican al final los
        // valores potencia y control
        Racket r1 = new PowerfulRacket("Head Radical", 260, 680, 680, StringingStyle.Abierto);
        Racket r2 = new PowerfulRacket("Wilson Blade", 260, 690, 680, StringingStyle.Abierto);
        Racket r3 = new PowerfulRacket("Dunlop CX200", 300, 700, 630, StringingStyle.Abierto);
        Racket r4 = new PowerfulRacket("Yonex Vcore", 300, 680, 650, StringingStyle.Cerrado);
        Racket r5 = new ControlledRacket("Babolat Drive", 340, 740, 600, StringingStyle.Cerrado);
        Racket r6 = new ControlledRacket("Pure Aero", 340, 680, 720, StringingStyle.Cerrado);
        Racket r7 = new ControlledRacket("TFlash 300", 300, 680, 680, StringingStyle.Cerrado);
        Racket r8 = new ControlledRacket("Wilson Silver", 220, 690, 650, StringingStyle.Abierto);
        Racket r9 = new BalancedRacket("Prince Hornet 100", 220, 690, 600, StringingStyle.Cerrado, 2.5, 4);
        Racket r10 = new BalancedRacket("Head Graphene", 320, 690, 630, StringingStyle.Abierto, 6, 2);
        Racket r11 = new BalancedRacket("Prince TT Bandit", 220, 680, 680, StringingStyle.Cerrado, 6, 3);
        Racket r12 = new BalancedRacket("Class 100L", 320, 680, 720, StringingStyle.Abierto, 8, 1);
        // Novedad en EC3: Las siguientes raquetas son nuevas para EC3
        Racket r14 = new PowerfulRacket("Wilson Energy XL", 260, 690, 680, StringingStyle.Abierto);
        Racket r15 = new PowerfulRacket("Wilson Pro Open", 340, 740, 720, StringingStyle.Abierto);
        Racket r16 = new PowerfulRacket("Babolat Boost Drive", 220, 680, 600, StringingStyle.Cerrado);
        Racket r17 = new PowerfulRacket("Babolat Pure Drive", 260, 720, 600, StringingStyle.Cerrado);
        Racket r18 = new ControlledRacket("Prince Force Ti OS", 340, 740, 600, StringingStyle.Cerrado);
        Racket r19 = new ControlledRacket("Head Prestige Pro", 340, 740, 720, StringingStyle.Abierto);
        Racket r20 = new ControlledRacket("Head Instinct", 220, 680, 600, StringingStyle.Abierto);
        Racket r21 = new ControlledRacket("Dunlop Nitro", 340, 720, 600, StringingStyle.Cerrado);
        Racket r22 = new BalancedRacket("Prince Force", 320, 690, 630, StringingStyle.Abierto, 6, 2);
        Racket r23 = new BalancedRacket("Prince Warrior", 340, 740, 720, StringingStyle.Abierto, 6, 2);
        Racket r24 = new BalancedRacket("Wilson Pro Staff", 220, 680, 600, StringingStyle.Cerrado, 2.5, 4);

        championship.racketSet(r1);
        championship.racketSet(r2);
        championship.racketSet(r3);
        championship.racketSet(r4);
        championship.racketSet(r5);
        championship.racketSet(r6);
        championship.racketSet(r7);
        championship.racketSet(r8);
        championship.racketSet(r9);
        championship.racketSet(r10);
        championship.racketSet(r11);
        championship.racketSet(r12);
        championship.racketSet(r14);
        championship.racketSet(r15);
        championship.racketSet(r16);
        championship.racketSet(r17);
        championship.racketSet(r18);
        championship.racketSet(r19);
        championship.racketSet(r20);
        championship.racketSet(r21);
        championship.racketSet(r22);
        championship.racketSet(r23);
        championship.racketSet(r24);

        championship.showChampionship();
        Logger.getInstance().finishWrite();
    }

    /**
     * Cargar datos 2.
     *
     * @param championship the championship
     */
    private void cargarDatos2() {
        // Inicializamos los datos necesarios
        Logger.getInstance().addOutputClass(new ConsoleOutput());
        Logger.getInstance().addOutputClass(new FileOutput("Salida2.txt"));
        Championship championship = Championship.getInstance();
        championship.setName("Campeonato de Extremadura");
        Racket.initializeMaps();

        // Instanciamos 8 zapatillas: (Los parámetros están en el orden: modelo,
        // número,
        // tipo valor)
        Shoes z1 = new Damped("Air Zoom Vapor Pro", 42, 5);
        Shoes z2 = new WithGrip("Court Vapor React", 40, 5);
        Shoes z3 = new WithGrip("Gel-Resolution 8 GS", 40, 4);
        Shoes z4 = new Damped("Vapor Lite", 42, 3);
        Shoes z5 = new WithGrip("Court Lite", 39, 3);
        Shoes z6 = new Damped("UberSonic 4K", 40, 5.5);
        Shoes z7 = new Damped("Zoom GP Turbo", 43, 7);
        Shoes z8 = new WithGrip("CourtJam Bounce", 42, 3.5);

        // Instanciamos 8 tenistas: (Los parámetros están en el orden nombre,
        // zapatillas, saque, resto, ranking, pais)
        TennisPlayer t1 = new PickguardPlayer("Novak Djokovic", z1, 90.0, 80.0, 1, "Serbia", 42);
        TennisPlayer t2 = new PickguardPlayer("Ashleigh Barty", z6, 70.0, 80.0, 1, "Australia", 40);
        TennisPlayer t3 = new PickguardPlayer("Stefanos Tsitsipas", z7, 55.0, 48.0, 3, "Grecia", 43);
        TennisPlayer t4 = new PickguardPlayer("Karolina Pliskova", z5, 67.0, 68.5, 3, "Rep Checa", 39);
        TennisPlayer t5 = new VolleyerPlayer("Elina Svitolina", z3, 55.5, 68.5, 4, "Ucrania", 40);
        TennisPlayer t6 = new VolleyerPlayer("Alexander Zverev", z8, 59.0, 49.5, 4, "Alemania", 42);
        TennisPlayer t7 = new VolleyerPlayer("Aryna Sabalenka", z2, 67.5, 79.5, 2, "Bielorrusia", 40);
        TennisPlayer t8 = new VolleyerPlayer("Daniil Medvedev", z4, 79.0, 68.0, 2, "Rusia", 42);

        // A continuaci�n se inscribirán a los 8 tenistas en el campeonato
        t1.enroll();
        t2.enroll();
        t3.enroll();
        t4.enroll();
        t5.enroll();
        t6.enroll();
        t7.enroll();
        t8.enroll();

        // A continuaci�n se inscribir�n a los 8 tenistas en el campeonato
        // Instanciamos zapatillas para ser usadas en el campeonato:
        // (Los parámetros están en el orden: tipo, modelo, número y valor)
        Shoes z9 = new Damped("Lotto Space", 40, 5);
        Shoes z10 = new WithGrip("Adidas Gamecourt", 40, 5);
        Shoes z11 = new WithGrip("Asics Gel-Game", 42, 4.5);
        Shoes z12 = new Damped("K-Swiss Express", 42, 3);
        Shoes z13 = new WithGrip("Joma Slam", 40, 3);
        Shoes z14 = new Damped("Babolat Jet Tere", 42, 5.5);
        Shoes z15 = new WithGrip("Asics Solution", 42, 3);
        Shoes z16 = new Damped("K-Swiss Hypercourt", 40, 5);
        Shoes z17 = new WithGrip("Nike Air Zoom", 40, 5);
        Shoes z18 = new WithGrip("Nike Zoom Vapor", 42, 4);
        Shoes z19 = new Damped("Wilson Rush", 42, 3.5);
        Shoes z20 = new Damped("Head Revolt", 40, 3);
        Shoes z21 = new Damped("Lotto Mirage", 40, 6);
        Shoes z22 = new WithGrip("Wilson Kaos", 41, 5);
        Shoes z23 = new WithGrip("Head Revolt Pro", 42, 4.5);

        championship.shoesList(z9);
        championship.shoesList(z10);
        championship.shoesList(z11);
        championship.shoesList(z12);
        championship.shoesList(z13);
        championship.shoesList(z14);
        championship.shoesList(z15);
        championship.shoesList(z16);
        championship.shoesList(z17);
        championship.shoesList(z18);
        championship.shoesList(z19);
        championship.shoesList(z20);
        championship.shoesList(z21);
        championship.shoesList(z22);
        championship.shoesList(z23);

        // Instanciamos raquetas para ser usadas en el campeonato:
        // (Los parámetros están en el orden: Modelo, peso, longitud, tamaño de
        // cabeza,
        // tipo de encordado)
        // Además en el caso de raquetas equilibradas también se indican al final los
        // valores potencia y control
        Racket r1 = new PowerfulRacket("Head Radical", 260, 680, 680, StringingStyle.Abierto);
        Racket r2 = new PowerfulRacket("Wilson Blade", 260, 690, 680, StringingStyle.Abierto);
        Racket r3 = new PowerfulRacket("Dunlop CX200", 300, 700, 630, StringingStyle.Abierto);
        Racket r4 = new PowerfulRacket("Yonex Vcore", 300, 680, 650, StringingStyle.Cerrado);
        Racket r5 = new ControlledRacket("Babolat Drive", 340, 740, 600, StringingStyle.Cerrado);
        Racket r6 = new ControlledRacket("Pure Aero", 340, 680, 720, StringingStyle.Cerrado);
        Racket r7 = new ControlledRacket("TFlash 300", 300, 680, 680, StringingStyle.Cerrado);
        Racket r8 = new ControlledRacket("Wilson Silver", 220, 690, 650, StringingStyle.Abierto);
        Racket r9 = new BalancedRacket("Prince Hornet 100", 220, 690, 600, StringingStyle.Cerrado, 2.5, 4);
        Racket r10 = new BalancedRacket("Head Graphene", 320, 690, 630, StringingStyle.Abierto, 6, 2);
        Racket r11 = new BalancedRacket("Prince TT Bandit", 220, 680, 680, StringingStyle.Cerrado, 6, 3);
        Racket r12 = new BalancedRacket("Class 100L", 320, 680, 720, StringingStyle.Abierto, 8, 1);
        // Novedad en EC3: Las siguientes raquetas son nuevas para EC3
        Racket r13 = new PowerfulRacket("Wilson Energy XL", 260, 690, 680, StringingStyle.Abierto);
        Racket r14 = new PowerfulRacket("Wilson Pro Open", 340, 740, 720, StringingStyle.Abierto);
        Racket r15 = new PowerfulRacket("Babolat Boost Drive", 220, 680, 600, StringingStyle.Cerrado);
        Racket r16 = new PowerfulRacket("Babolat Pure Drive", 260, 720, 600, StringingStyle.Cerrado);

        championship.racketSet(r1);
        championship.racketSet(r2);
        championship.racketSet(r3);
        championship.racketSet(r4);
        championship.racketSet(r5);
        championship.racketSet(r6);
        championship.racketSet(r7);
        championship.racketSet(r8);
        championship.racketSet(r9);
        championship.racketSet(r10);
        championship.racketSet(r11);
        championship.racketSet(r12);
        championship.racketSet(r13);
        championship.racketSet(r14);
        championship.racketSet(r15);
        championship.racketSet(r16);

        championship.showChampionship();
        Logger.getInstance().finishWrite();
    }

    private void cargarDatos3() {
        Logger.getInstance().addOutputClass(new ConsoleOutput());
        Logger.getInstance().addOutputClass(new FileOutput("Salida3.txt"));
        Championship championship = Championship.getInstance();

        // Inicializamos los datos necesarios
        Racket.initializeMaps();

        // Instanciamos 8 zapatillas: (Los parámetros están en el orden: tipo, modelo,
        // número y valor)
        Shoes z1 = new Damped("Air Zoom Vapor Pro", 42, 5);
        Shoes z2 = new WithGrip("Court Vapor React", 40, 5);
        Shoes z3 = new WithGrip("Gel-Resolution 8 GS", 40, 4);
        Shoes z4 = new Damped("Vapor Lite", 42, 3);
        Shoes z5 = new WithGrip("Court Lite", 39, 3);
        Shoes z6 = new Damped("UberSonic 4K", 40, 6);
        Shoes z7 = new Damped("Zoom GP Turbo", 43, 3.5);
        Shoes z8 = new WithGrip("CourtJam Bounce", 42, 3.5);

        // Instanciamos 8 tenistas: (Los parámetros están en el orden nombre,
        // zapatillas, saque, resto, ranking, pais)
        TennisPlayer t1 = new PickguardPlayer("Novak Djokovic", z1, 90.0, 80.0, 1, "Serbia", 42);
        TennisPlayer t2 = new PickguardPlayer("Ashleigh Barty", z2, 70.0, 80.0, 1, "Australia", 40);
        TennisPlayer t3 = new VolleyerPlayer("Stefanos Tsitsipas", z7, 55.0, 48.0, 3, "Grecia", 43);
        TennisPlayer t4 = new VolleyerPlayer("Karolina Pliskova", z5, 67.0, 68.5, 3, "Rep Checa", 39);
        TennisPlayer t5 = new PickguardPlayer("Elina Svitolina", z6, 55.5, 68.5, 4, "Ucrania", 40);
        TennisPlayer t6 = new PickguardPlayer("Alexander Zverev", z8, 59.0, 49.5, 4, "Alemania", 42);
        TennisPlayer t7 = new VolleyerPlayer("Aryna Sabalenka", z3, 67.5, 79.5, 2, "Bielorrusia", 40);
        TennisPlayer t8 = new VolleyerPlayer("Daniil Medvedev", z4, 79.0, 68.0, 2, "Rusia", 42);

        // A continuaci�n se inscribir�n a los 8 tenistas en el campeonato
        t1.enroll();
        t2.enroll();
        t3.enroll();
        t4.enroll();
        t5.enroll();
        t6.enroll();
        t7.enroll();
        t8.enroll();

        // Instanciamos zapatillas para ser usadas en el campeonato:
        // (Los parámetros están en el orden: tipo, modelo, número y valor)
        Shoes z9 = new Damped("Lotto Space", 40, 5);
        Shoes z10 = new Damped("K-Swiss Express", 42, 3);
        Shoes z11 = new Damped("Babolat Jet Tere", 42, 5.5);
        Shoes z12 = new Damped("Lotto Mirage", 40, 6);
        Shoes z13 = new Damped("K-Swiss Hypercourt", 40, 5);
        Shoes z14 = new Damped("Wilson Rush", 42, 3.5);
        Shoes z15 = new Damped("Head Revolt", 40, 5);
        Shoes z16 = new WithGrip("Joma Slam", 40, 3);
        Shoes z17 = new WithGrip("Adidas Gamecourt", 40, 5);
        Shoes z18 = new WithGrip("Asics Gel-Game", 42, 4.5);
        Shoes z19 = new WithGrip("Asics Solution", 42, 3);
        Shoes z20 = new WithGrip("Nike Air Zoom", 40, 5);
        Shoes z21 = new WithGrip("Nike Zoom Vapor", 42, 4);
        Shoes z22 = new WithGrip("Wilson Kaos", 41, 5);
        Shoes z23 = new WithGrip("Head Revolt Pro", 42, 4.5);

        championship.shoesList(z9);
        championship.shoesList(z10);
        championship.shoesList(z11);
        championship.shoesList(z12);
        championship.shoesList(z13);
        championship.shoesList(z14);
        championship.shoesList(z15);
        championship.shoesList(z16);
        championship.shoesList(z17);
        championship.shoesList(z18);
        championship.shoesList(z19);
        championship.shoesList(z20);
        championship.shoesList(z21);
        championship.shoesList(z22);
        championship.shoesList(z23);

        // Instanciamos raquetas para ser usadas en el campeonato:
        // (Los parámetros están en el orden: Modelo, peso, longitud, tamaño de
        // cabeza,
        // tipo de encordado)
        // Además en el caso de raquetas equilibradas también se indican al final los
        // valores potencia y control
        Racket r1 = new PowerfulRacket("Head Radical", 260, 680, 680, StringingStyle.Abierto);
        Racket r2 = new PowerfulRacket("Wilson Blade", 260, 690, 680, StringingStyle.Abierto);
        Racket r3 = new PowerfulRacket("Dunlop CX200", 300, 700, 630, StringingStyle.Abierto);
        Racket r4 = new PowerfulRacket("Yonex Vcore", 300, 680, 650, StringingStyle.Cerrado);

        championship.racketSet(r1);
        championship.racketSet(r2);
        championship.racketSet(r3);
        championship.racketSet(r4);

        championship.showChampionship();
        Logger.getInstance().finishWrite();
    }
}