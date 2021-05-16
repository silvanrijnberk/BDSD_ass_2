package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {

    public static void main(String[] args) {
//        File dir = new File("src/results");
//        for(File file: dir.listFiles()) {
//            if (!file.isDirectory()) {
//                try {
//                    Files.deleteIfExists(file.toPath());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        String[] paths_nl = {"src/data_files/NL_book_1", "src/data_files/NL_book_2", "src/data_files/NL_book_3", "src/data_files/NL_book_4", "src/data_files/NL_book_5"};
//        String[] paths_en = {"src/data_files/EN_book_1", "src/data_files/EN_book_2", "src/data_files/EN_book_3", "src/data_files/EN_book_4", "src/data_files/EN_book_5"};
        Classifier classifier = new Classifier();
//        for (String path: paths_nl) {
//            classifier.Classify(path, "NL");
//        }
//        for (String path: paths_en) {
//            classifier.Classify(path, "EN");
//        }
        classifier.Eveluate("time be generously rewarded by NASA.  Young descended those final few\n" +
                "ernstig aan twijfelen. Hij blijkt een van de velen te zijn die, in\n" +
                "daartoe een nuttige bijdrage levert, is de vraag.\n" +
                "uiting van persoonlijke ontgoocheling, die meer heeft van een litanie\n" +
                "It must have been so tempting to go for a landing. Cernan was wistful:\n" +
                "moon by Neil and Buzz.  The willingness of the Apollo 10 crew to serve\n" +
                "Apollo flights had to become both safer and more daring at the same\n" +
                "tail hook down and we’re there,” said Mr. Stafford during the Apollo\n" +
                "Roger Chaffee — who perished in the 1967 Apollo 1 fire.  Successive\n" +
                "gedragen moeten worden, ook al is het soms tegen wil en dank [mijn\n" +
                "Why Apollo 10 Stopped Just 47,000 Feet From the Moon In a year when\n" +
                "never know how big this thing is when there ain’t nobody in here but\n" +
                "nationale’ vertonen, Europa geen prioriteit meer bij de politici kan\n" +
                "simple: Practice and work out the kinks and set the stage for a\n" +
                "voert waar hij het mee eens is. In het interview met Laura Starink in\n" +
                "Galveston Bay too!\" What ran through their minds when the command\n" +
                "was one critical order: don’t actually land on the moon.  It would be\n" +
                "this decade is out, of landing a man on the moon and returning him\n" +
                "moon walker, “that there’s enough boulders down here to fill up\n" +
                "Europese eenwording zich voltrekt.’ Voordat alle deelnemende landen\n" +
                "descent; and, the lonely vigil of Michael Collins in orbit above his\n" +
                "Nederland betreft, is dat waar, maar of zijn gemoedsuitstorting\n" +
                "remembered and celebrated.  An Earthrise taken by Apollo 10.\n" +
                "scientists and others both in government and industry. It also cost\n" +
                "Project Gemini, NASA’s precursor to Apollo. Their mission aboard was\n" +
                "Isabella had sent a ship to the New World in 1491 and asked its\n" +
                "crew. Transcripts of their conversations reveal that they didn’t have\n" +
                "sending a party to scout passage to the Pacific Ocean in 1803, then\n" +
                "ging. ‘Als iets ongenadig duidelijk is geworden, dan is het de\n" +
                "de eurocrisis die hem de ogen opende voor het werkelijke Europa, en\n" +
                "eenheid. Ook Joop den Uyl stelde als minister-president in 1973 zulke\n" +
                "that they took to help America to win that sprint, deserve to be\n" +
                "down and we’re there,” said Mr. Stafford during the Apollo 10 mission.\n" +
                "dubbed “Charlie Brown” for the Apollo 10 mission to the moon, viewed\n" +
                "Spectator, waarvan hij de hoofdredacteur is. Maar dat is een\n" +
                "missen. Duitsland is volgens hem te streng voor de Zuid-Europese\n" +
                "Earthrise and it’s got to be magnificent!”  The view of the stark\n" +
                "trailblazers, and their story adds richness and humanity to the\n" +
                "order: don’t actually land on the moon.  The command service module,\n" +
                "the pathfinders who completed the same mission with one critical\n" +
                "aboard Charlie Brown, Cernan called out, “Oh Charlie! We just saw\n" +
                "Op grond van de vele reizen die Geert Mak door Europa heeft gemaakt en\n" +
                "politici in de eerste plaats verantwoording verschuldigd zijn aan hun\n" +
                "was just as excited, exclaiming, “We are close, babe! This is, like,\n" +
                "vormen in veel landen een macht die electoraal niet te veronachtzamen\n" +
                "three-day Earth to Moon cruise; lunar orbit undocking; descent of the\n" +
                "opnieuw centraal stellen’, zegt hij aan het eind.  Centraal stellen?\n" +
                "- Mak grossiert in het werkwoord moeten zonder onderzocht te hebben of\n" +
                "deze krant van 3 januari komt hij uit op Duitsland als leider, maar\n" +
                "splashdown — were the same risks the Apollo 11 crew would have to\n" +
                "over een verloren liefde dan van een analyse? Mak zegt zelf dat er\n" +
                "Aldrin during the critical moments of the Eagle lander’s final\n" +
                "it!”  Snapping photos out the window and noting the many boulders that\n" +
                "(nationale) kiezers, die een ‘toenemende voorkeur voor het eigene en\n" +
                "launchpad. Apollo 10’s officers had all earned astronaut wings during\n" +
                "this month.  Spurred by President John F. Kennedy’s 1961 speech\n" +
                "worden geschapen, zoals dat in veel landen in de 19de eeuw op\n" +
                "mogelijk. Dat brengt hem in de buurt van De Gaulles ‘Europa der\n" +
                "the ship to set foot on them, because the next captain and crew were\n" +
                "as something like stand-ins instead of the stars of the show would in\n" +
                "history of the race to the moon. Their achievements, and the risks\n" +
                "finally came from Houston to fire the ascent engine and head back up?\n" +
                "mates, waiting to bring them back home.  But we also need to celebrate\n" +
                "take, with one distinction. A moon landing was not to be.  They\n" +
                "returned to the moon, he was the American commander of the\n" +
                "gelijknamige televisieserie zou je verwachten dat hij ook een kenner\n" +
                "centraal stellen van de democratie?  Hij doet wel meer uitspraken\n" +
                "commanded the first flight of the space shuttle. Cernan, too, made it\n" +
                "van Europa was. Zijn laatste publicatie, een pamflet van 94 pagina's, doet daar\n" +
                "it was built. All of the risks that they would take to prove out the\n" +
                "cursivering, JLH]’. Hij geeft dus prioriteit aan Europese eenheid\n" +
                "human footsteps were at last emblazoned on the dusty surface of the\n" +
                "emerging détente between the world’s superpowers.  In the annals of\n" +
                "nationaal niveau is gebeurd.’ Nu was die eeuw de eeuw van\n" +
                "lunar landscape below them from that altitude, scarred by billions of\n" +
                "They would eventually guide the lander to within only about 47,000\n" +
                "nationalisme, en daar waren twee wereldoorlogen het gevolg van. Wil\n" +
                "politisering die Mak waarschijnlijk niet zint. Niettemin: populisten\n" +
                "supranationale ideaal toch al duidelijk? Mak stipt ze nu wel aan, maar\n" +
                "then blast off again. According to Craig Nelson, author of the book\n" +
                "50th anniversary of the first humans to walk on the moon.  We remember\n" +
                "het eens worden over het soort samenleving - een meer socialistische\n" +
                "the crew of Apollo 9 in March 1969, to fly the first test mission of\n" +
                "willen brengen, is belangrijker dan het tempo waarin het proces van\n" +
                "Europa blijven bestaan’. Geen goede basis dus voor een politieke\n" +
                "‘cause they might!’”  Two months later as the entire world looked on,\n" +
                "‘diepgaande cultuurverschillen, die, ondanks alle samenwerking, binnen\n" +
                "perform a full dress-rehearsal of the Apollo 11 mission just two\n" +
                "journeys to the lunar surface. But the astronauts of Apollo 10 were\n" +
                "from the lunar module “Snoopy” in 1969.  Soon we will recognize the\n" +
                "waarvan hij verslag heeft gedaan in zijn boek In Europa (2004) en een\n" +
                "successful landing on the moon (and safe return to Earth).  But there\n" +
                "miles to the moon’s surface as commander of Apollo 16, and later\n" +
                "tot een echte analyse komt hij niet. Terecht zegt hij dat het ‘bovenal\n" +
                "they began to fall toward the surface, Cernan quipped back, “You’ll\n" +
                "getrompetter voelen we ons slechts zelden Europeaan’. Er zijn\n" +
                "one guy,” Young told his departing friends from his lonely outpost. As\n" +
                "re-docking; three more days back to Earth; then a Pacific Ocean\n" +
                "onbestuurbaarheid van het huidige Europa als supranationale eenheid.’\n" +
                "Cernan undocked for their descent toward the landing site in the\n" +
                "ogen openhield, waren de werkelijke oorzaken van het falen van het\n" +
                "waarvan hij de portee niet lijkt te hebben doordacht. Zoals: ‘Er moet’\n" +
                "of people we were: ‘Don’t give those guys an opportunity to land,\n" +
                "“It looks like we’re getting so close all you have to do is put your\n" +
                "almost everything that Aldrin, Armstrong and Collins did, but they\n" +
                "is.  Hij zegt dat de Europese landen ‘een dringende behoefte aan meer\n" +
                "saying, don’t touch a thing, especially not the ocean — because Lewis\n" +
                "staten’, vervloekt door Maks geestverwanten.  Heeft hij dit werkelijk\n" +
                "democratieën supranationale vraagstukken eigenlijk wel kunnen\n" +
                "set, then for a full dress rehearsal by the next crew to the\n" +
                "years of impact cratering, was just as stunning to the\n" +
                "hij werkelijk een Europees nationalisme?  Wat is het nut van zo'n\n" +
                "months beforehand. Commander Thomas P. Stafford; John W. Young, the\n" +
                "een politieke crisis’ is. We moeten dan ook ‘de politiek en democratie\n" +
                "Earth orbit in a joint effort to redirect the space race toward an\n" +
                "betekent en dat de ‘Europese besluiten door de Europese burgers\n" +
                "is’, en daarmee bedoelt hij het Europese project dat in 1950 van start\n" +
                "Armstrong making those first bootprints; the cool bravado of Buzz\n" +
                "“Rocket Men,” Cernan speculated that the lander’s ascent module had\n" +
                "except it would be nice to be around here more often …”  “It looks\n" +
                "lander nicknamed Snoopy almost to the surface; reascending and\n" +
                "captain and crew to find new lands to the west without getting out of\n" +
                "would be the first crewed lunar mission to fly the command module\n" +
                "feet above the surface — close enough to test the landing radar and\n" +
                "het is ‘doodzonde’ dat de Duitsers daarvoor de ‘grootsheid’\n" +
                "snit’, zegt Jan Rood in het januarinummer van de Internationale\n" +
                "unfathomable, to go all that way, to take all of those risks and then\n" +
                "safely to the Earth,” NASA went on an 8-year lunar sprint. This bold\n" +
                "centrale leiding’ hebben - maar dan wel een leiding die een beleid\n" +
                "much free time to admire it though, given the intense concentration\n" +
                "at one point Stafford remarked, “It looks like we’re getting so close\n" +
                "time to meet Kennedy’s deadline. Delays in the completion of the lunar\n" +
                "“The spacecraft is looking good and there are no problems, Charlie,\n" +
                "surface. While relaying their reactions and perspective back to Young\n" +
                "dit ook moge betekenen)? Eerder heeft hij al de vraag gesteld of ‘onze\n" +
                "equipment and procedures — launching; Earth-orbital docking; the\n" +
                "lander, also known as the Lunar Excursion Module, meant that Apollo 8\n" +
                "dat ziet er heel anders uit dan het gedroomde. In eerste plaats: er is\n" +
                "of een meer conservatieve - dat tot stand gebracht moet worden, kunnen\n" +
                "the lander into space, spending 10 days in Earth orbit.  The stage was\n" +
                "we’ll celebrate Apollo 11’s 50th anniversary, it’s worth remembering\n" +
                "‘gebrek aan Europese identiteit. Ondanks al die jaren van Europees\n" +
                "around the same maximum altitude of commercial aircraft above Earth’s\n" +
                "borne by the relatively unheralded crew of Apollo 10 fifty years ago\n" +
                "executed the rehearsal flawlessly. While Young circled above them in\n" +
                "10 mission. But Snoopy didn’t have enough fuel to land on the moon and\n" +
                "al lang gepolitiseerd, al is het ‘een politisering van populistische\n" +
                "gebeurde’.  Geen goed uitgangspunt voor een journalist.  Het was pas\n" +
                "challenging the nation to “commit itself to achieving the goal, before\n" +
                "Op die manier komt er natuurlijk niets terecht van de Europese\n" +
                "to the surface as the commander of Apollo 17 in 1972, and is still the\n" +
                "the many pathfinders who made this historic mission possible. Among\n" +
                "the lives of three heroic astronauts — Gus Grissom, Ed White, and\n" +
                "the most critical were the crew of Apollo 10, who were asked to\n" +
                "all you have to do is put your tail hook down and we’re there.” Cernan\n" +
                "sense, though, those were the instructions, and that was the burden,\n" +
                "the command and service module nicknamed Charlie Brown, Stafford and\n" +
                "referring to their geologist-astronaut colleague and future Apollo 17\n" +
                "hanteren’. Goeie vraag, want steeds duidelijker wordt het dat, omdat\n" +
                "Op z'n hoogst is ‘een losser verband van Europese staten’\n" +
                "‘nooit een goede publieke discussie’ over Europa is geweest. Wat\n" +
                "endeavor would employ close to a half million engineers, technicians,\n" +
                "like we’re getting so close all you have to do is put your tail hook\n" +
                "history, the mission of Apollo 10 has been overshadowed by later\n" +
                "boven democratie. Dat is tenminste eerlijk. Maar hoe klopt dat met het\n" +
                "Apollo-Soyuz Test Project in 1975, docking with Soviet counterparts in\n" +
                "been short-fueled on purpose: “A lot of people thought about the kind\n" +
                "(and occasional computer glitch repair) needed to fly Snoopy.  Still,\n" +
                "they could clearly see, Stafford proclaimed, “Tell Jack Schmitt,”\n" +
                "scheduled to do that in 1492.  Or picture President Thomas Jefferson\n" +
                "weggeven van soevereiniteit ‘ook het inleveren van democratie’\n" +
                "stopped just before landing on the moon.  Imagine if Ferdinand and\n" +
                "Wat betekent dat precies? Trouwens, als thema is de Europese eenheid\n" +
                "pas ontdekt tijdens de eurocrisis van de laatste jaren? Voor wie zijn\n" +
                "eenheid.  Daar wanhoopt hij dan ook aan. ‘Ik vrees dat het voorbij\n" +
                "pull back, not grabbing the brass ring and reaping the rewards. In a\n" +
                "the first time the moon lander was flown in the environment for which\n" +
                "never know how small it looks when you’re as far away as we are.”\n" +
                "and Clark are scheduled to do that the following year.  It seems\n" +
                "gebaseerd was op wat we hoopten dat er zou gebeuren, niet op wat er\n" +
                "and celebrate the heroism of the Apollo 11 crew: the humility of Neil\n" +
                "command module pilot; and Eugene A. Cernan, lunar module pilot, did\n" +
                "only, from which 1968’s famed “Earthrise” photo was taken. It fell to\n" +
                "we lang wachten.  En democratie, die Mak ook centraal wil stellen (wat\n" +
                "zondaren. Leiderschap accepteert hij dus alleen op zijn voorwaarden.\n" +
                "voorwaarden: ‘De vraag wat voor samenleving wij in Europa tot stand\n" +
                "last person to have walked on the moon.  Although Stafford never again\n" +
                "hebben (zo het die ooit heeft gehad).  Mak meent dan ook dat het\n" +
                "zijn eigen woorden, ‘te lang vastgehouden hebben aan een realiteit die\n" +
                "het wel kan - ‘op Europees niveau eindelijk een publieke eenheid\n" +
                "smooth, dark volcanic plains of the Sea of Tranquillity.  “You’ll");
    }
}
