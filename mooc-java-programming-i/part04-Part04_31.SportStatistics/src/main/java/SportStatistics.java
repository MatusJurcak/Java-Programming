
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        ArrayList<Matches> matches = readRecordsFromFile(file);
        System.out.println("Team:");
        String team = scan.nextLine();
        int games = 0;
        int wins = 0;
        int losses = 0;
        for(Matches match : matches){
            if(match.getHomeTeam().equals(team)){
                games++;
                if(match.getHomePoints() > match.getAwayPoints()){
                    wins++;
                } else{
                    losses++;
                }
            } else if(match.getAwayTeam().equals(team)){
                games++;
                if(match.getAwayPoints() > match.getHomePoints()){
                    wins++;
                } else{
                    losses++;
                }
            }
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    public static ArrayList<Matches> readRecordsFromFile(String file) {
        ArrayList<Matches> matches = new ArrayList<>();
        
        try(Scanner scanner = new Scanner(Paths.get(file))){
            while(scanner.hasNextLine()){
                String info = scanner.nextLine();
                String[] parts = info.split(",");
                String nameHomeTeam = parts[0];
                String nameAwayTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int awayPoints = Integer.valueOf(parts[3]);
                Matches match = new Matches(nameHomeTeam, nameAwayTeam, homePoints, awayPoints);
                matches.add(match);
            }
            
            
        } catch (Exception x){
            
        }
        return matches;

    }

}
