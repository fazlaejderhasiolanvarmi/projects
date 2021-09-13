import java.util.*;

import javax.swing.JOptionPane;

public class DealOrNoDeal extends javax.swing.JFrame {
	
	private int price[];
	private int userCase;
	private int turn = 1;
	private String pastOffer = "Offers\n-------------------\n";
	private String s;
	private int offerCount = 1;
	private int availableCases = 26;
	
    public DealOrNoDeal() {
        initComponents();
        int p[] = {1, 5, 10, 15, 25, 50, 75, 100, 200, 300, 400, 500, 750, 1000, 5000, 10000, 25000, 50000, 75000, 100000, 200000, 300000, 400000, 500000, 750000, 1000000};
        price = p;
        
        Random rgen = new Random();
        
        for (int i = 0; i < price.length; i++) {
		    int randomPosition = rgen.nextInt(price.length);
		    int temp = price[i];
		    price[i] = price[randomPosition];
		    price[randomPosition] = temp;
		}
    }
    
    public void gameOver() {
    	caseEight.setEnabled(false);
        caseEighteen.setEnabled(false);
        caseEleven.setEnabled(false);
        caseFifteen.setEnabled(false);
        caseFive.setEnabled(false);
        caseFour.setEnabled(false);
        caseFourteen.setEnabled(false);
        caseNine.setEnabled(false);
        caseNineteen.setEnabled(false);
        caseOne.setEnabled(false);
        caseSeven.setEnabled(false);
        caseSeventeen.setEnabled(false);
        caseSix.setEnabled(false);
        caseSixteen.setEnabled(false);
        caseTen.setEnabled(false);
        caseThirteen.setEnabled(false);
        caseThree.setEnabled(false);
        caseTwelve.setEnabled(false);
        caseTwenty.setEnabled(false);
        caseTwentyFive.setEnabled(false);
        caseTwentyFour.setEnabled(false);
        caseTwentyOne.setEnabled(false);
        caseTwentySix.setEnabled(false);
        caseTwentyThree.setEnabled(false);
        caseTwentyTwo.setEnabled(false);
        caseTwo.setEnabled(false);
    }
    
    public void hideValue(int v) {
    	if(v == 1) {
    		oneLira.setEnabled(false);
    	}else if(v == 5) {
    		fiveLira.setEnabled(false);
    	}else if(v == 10) {
    		tenLira.setEnabled(false);
    	}else if(v == 15) {
    		fifteenLira.setEnabled(false);
    	}else if(v == 25) {
    		twentyfiveLira.setEnabled(false);
    	}else if(v == 50) {
    		fiftyLira.setEnabled(false);
    	}else if(v == 75) {
    		seventyfiveLira.setEnabled(false);
    	}else if(v == 100) {
    		onehundredLira.setEnabled(false);
    	}else if(v == 200) {
    		twohundredLira.setEnabled(false);
    	}else if(v == 300) {
    		threehundredLira.setEnabled(false);
    	}else if(v == 400) {
    		fourhundredLira.setEnabled(false);
    	}else if(v == 500) {
    		fivehundredLira.setEnabled(false);
    	}else if(v == 750) {
    		sevenhundredfiftyLira.setEnabled(false);
    	}else if(v == 1000) {
    		onekLira.setEnabled(false);
    	}else if(v == 5000) {
    		fivekLira.setEnabled(false);
    	}else if(v == 10000) {
    		tenkLira.setEnabled(false);
    	}else if(v == 25000) {
    		twentyfivekLira.setEnabled(false);
    	}else if(v == 50000) {
    		fiftykLira.setEnabled(false);
    	}else if(v == 75000) {
    		seventyfivekLira.setEnabled(false);
    	}else if(v == 100000) {
    		onehundredkLira.setEnabled(false);
    	}else if(v == 200000) {
    		twohundredkLira.setEnabled(false);
    	}else if(v == 300000) {
    		threehundredkLira.setEnabled(false);
    	}else if(v == 400000) {
    		fourhundredkLira.setEnabled(false);
    	}else if(v == 500000) {
    		fivehundredkLira.setEnabled(false);
    	}else if(v == 750000) {
    		sevenhundredfiftykLira.setEnabled(false);
    	}else if(v == 1000000) {
    		onemLira.setEnabled(false);
    	}
    }
    
    public void checkTurn() {   	
    	if(turn < 9) {
    		label.setText(s + ". Turns left for next offer: " + (9 - turn));
    	}else if(turn < 15){
    		label.setText(s + ". Turns left for next offer: " + (15 - turn));
    	}else if(turn < 19){
    		label.setText(s + ". Turns left for next offer: " + (19 - turn));
    	}else if(turn < 22){
    		label.setText(s +  ". Turns left for next offer: " + (22 - turn));
    	}else if(turn < 24){
    		label.setText(s +  ". Turns left for next offer: " + (24 - turn));
    	}else if(turn < 25){
    		label.setText(s +  ". Turns left for next offer: " + (25 - turn));
    	}else if(turn < 26){
    		label.setText(s +  ". Turns left for next offer: " + (25 - turn));
    	}else {
    		label.setText("FINAL ROUND!");
    	}
    	
    	if(turn == 9) {
    		offer();
    	}else if(turn == 15){
    		offer();
    	}else if(turn == 19){
    		offer();
    	}else if(turn == 22){
    		offer();
    	}else if(turn == 24){
    		offer();
    	}else if(turn == 25){
    		offer();
    	}else if(turn == 26){
    		showCase();
    	}
    	
    	if(turn != 1) {
    		availableCases--;
    	}
    }
    
    public void offer() {
    	float sum = 0;
    	for(int i = 0; i < price.length; i++) {
    		sum += price[i];
    	}
    	
    	int result = JOptionPane.showConfirmDialog(null, "Mr. Hamdi's offer is " + (sum/availableCases) + "\nDo you want to accept it?", "Mr. Hamdi's Offer", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
    	
    	switch (result) {
         	case JOptionPane.OK_OPTION:
         		JOptionPane.showMessageDialog(null, "Congratulations!\nYou won " + (sum/availableCases) + "TL!!");
         		gameOver();
         		break;
         
         	case JOptionPane.CANCEL_OPTION:
         		break;
    	}
    	
    	pastOffer += offerCount + ". Offer is  " + (sum/availableCases) + " TL\n";
    	offerCount++;
    }
    
    public void showCase() {
    	int result = JOptionPane.showConfirmDialog(null, "2 Cases left.\nDo you want to go to your case?", "Final ROUND", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
    	
    	switch (result) {
     	case JOptionPane.OK_OPTION:
     		JOptionPane.showMessageDialog(null, "Congratulations!\nYou won " + price[userCase -1] + " TL!!");
     		gameOver();
     		break;
     
     	case JOptionPane.CANCEL_OPTION:
     		int p = 0;
     		for(int i = 0; i < price.length; i++) {
     			if(price[i] != 0 && (i != userCase -1)) {
     				p = price[i];
     			}
     		}
     		JOptionPane.showMessageDialog(null, "Congratulations!\nYou won " + p + " TL!!\nYou had " + price[userCase -1] + " TL in your case.");
     		gameOver();
     		break;
	}
    }
    
    @SuppressWarnings("unchecked")                         
    private void initComponents() {

        oneLira = new javax.swing.JButton();
        fiveLira = new javax.swing.JButton();
        tenLira = new javax.swing.JButton();
        fifteenLira = new javax.swing.JButton();
        twentyfiveLira = new javax.swing.JButton();
        fiftyLira = new javax.swing.JButton();
        seventyfiveLira = new javax.swing.JButton();
        onehundredLira = new javax.swing.JButton();
        twohundredLira = new javax.swing.JButton();
        threehundredLira = new javax.swing.JButton();
        fourhundredLira = new javax.swing.JButton();
        fivehundredLira = new javax.swing.JButton();
        sevenhundredfiftyLira = new javax.swing.JButton();
        onekLira = new javax.swing.JButton();
        fivekLira = new javax.swing.JButton();
        tenkLira = new javax.swing.JButton();
        twentyfivekLira = new javax.swing.JButton();
        fiftykLira = new javax.swing.JButton();
        seventyfivekLira = new javax.swing.JButton();
        onehundredkLira = new javax.swing.JButton();
        twohundredkLira = new javax.swing.JButton();
        threehundredkLira = new javax.swing.JButton();
        fourhundredkLira = new javax.swing.JButton();
        fivehundredkLira = new javax.swing.JButton();
        sevenhundredfiftykLira = new javax.swing.JButton();
        onemLira = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        caseThree = new javax.swing.JButton();
        caseOne = new javax.swing.JButton();
        caseTwo = new javax.swing.JButton();
        caseFour = new javax.swing.JButton();
        caseFive = new javax.swing.JButton();
        caseEleven = new javax.swing.JButton();
        caseTwelve = new javax.swing.JButton();
        caseThirteen = new javax.swing.JButton();
        caseFourteen = new javax.swing.JButton();
        caseFifteen = new javax.swing.JButton();
        caseSeventeen = new javax.swing.JButton();
        caseEighteen = new javax.swing.JButton();
        caseNineteen = new javax.swing.JButton();
        caseTwenty = new javax.swing.JButton();
        caseTwentyOne = new javax.swing.JButton();
        caseSix = new javax.swing.JButton();
        caseSeven = new javax.swing.JButton();
        caseEight = new javax.swing.JButton();
        caseNine = new javax.swing.JButton();
        caseTen = new javax.swing.JButton();
        caseTwentyTwo = new javax.swing.JButton();
        caseTwentyThree = new javax.swing.JButton();
        caseTwentyFour = new javax.swing.JButton();
        caseTwentyFive = new javax.swing.JButton();
        caseTwentySix = new javax.swing.JButton();
        caseSixteen = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        newGame = new javax.swing.JMenuItem();
        exitGame = new javax.swing.JMenuItem();
        offers = new javax.swing.JMenu();
        about = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Deal Or No Deal");

        oneLira.setText("1 TL");

        fiveLira.setText("5 TL");

        tenLira.setText("10 TL");

        fifteenLira.setText("15 TL");

        twentyfiveLira.setText("25 TL");

        fiftyLira.setText("50 TL");

        seventyfiveLira.setText("75 TL");

        onehundredLira.setText("100 TL");

        twohundredLira.setText("200 TL");

        threehundredLira.setText("300 TL");

        fourhundredLira.setText("400 TL");

        fivehundredLira.setText("500 TL");

        sevenhundredfiftyLira.setText("750 TL");

        onekLira.setText("1,000 TL");

        fivekLira.setText("5,000 TL");

        tenkLira.setText("10,000 TL");

        twentyfivekLira.setText("25,000 TL");

        fiftykLira.setText("50,000 TL");

        seventyfivekLira.setText("75,000 TL");

        onehundredkLira.setText("100,000 TL");

        twohundredkLira.setText("200,000 TL");

        threehundredkLira.setText("300,000 TL");

        fourhundredkLira.setText("400,000 TL");

        fivehundredkLira.setText("500,000 TL");

        sevenhundredfiftykLira.setText("750,000 TL");

        onemLira.setText("1,000,000 TL");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        label.setText("CHOOSE YOUR CASE");

        caseThree.setBackground(java.awt.Color.blue);
        caseThree.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        caseThree.setForeground(new java.awt.Color(255, 255, 255));
        caseThree.setText("3");
        caseThree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseThreeMouseClicked(evt);
            }
        });

        caseOne.setBackground(java.awt.Color.blue);
        caseOne.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        caseOne.setForeground(new java.awt.Color(255, 255, 255));
        caseOne.setText("1");
        caseOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseOneMouseClicked(evt);
            }
        });

        caseTwo.setBackground(java.awt.Color.blue);
        caseTwo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        caseTwo.setForeground(new java.awt.Color(255, 255, 255));
        caseTwo.setText("2");
        caseTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseTwoMouseClicked(evt);
            }
        });

        caseFour.setBackground(java.awt.Color.blue);
        caseFour.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        caseFour.setForeground(new java.awt.Color(255, 255, 255));
        caseFour.setText("4");
        caseFour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseFourMouseClicked(evt);
            }
        });

        caseFive.setBackground(java.awt.Color.blue);
        caseFive.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        caseFive.setForeground(new java.awt.Color(255, 255, 255));
        caseFive.setText("5");
        caseFive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseFiveMouseClicked(evt);
            }
        });

        caseEleven.setBackground(java.awt.Color.blue);
        caseEleven.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        caseEleven.setForeground(new java.awt.Color(255, 255, 255));
        caseEleven.setText("11");
        caseEleven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseElevenMouseClicked(evt);
            }
        });

        caseTwelve.setBackground(java.awt.Color.blue);
        caseTwelve.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        caseTwelve.setForeground(new java.awt.Color(255, 255, 255));
        caseTwelve.setText("12");
        caseTwelve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseTwelveMouseClicked(evt);
            }
        });

        caseThirteen.setBackground(java.awt.Color.blue);
        caseThirteen.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        caseThirteen.setForeground(new java.awt.Color(255, 255, 255));
        caseThirteen.setText("13");
        caseThirteen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseThirteenMouseClicked(evt);
            }
        });

        caseFourteen.setBackground(java.awt.Color.blue);
        caseFourteen.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        caseFourteen.setForeground(new java.awt.Color(255, 255, 255));
        caseFourteen.setText("14");
        caseFourteen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseFourteenMouseClicked(evt);
            }
        });

        caseFifteen.setBackground(java.awt.Color.blue);
        caseFifteen.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        caseFifteen.setForeground(new java.awt.Color(255, 255, 255));
        caseFifteen.setText("15");
        caseFifteen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseFifteenMouseClicked(evt);
            }
        });

        caseSeventeen.setBackground(java.awt.Color.blue);
        caseSeventeen.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        caseSeventeen.setForeground(new java.awt.Color(255, 255, 255));
        caseSeventeen.setText("17");
        caseSeventeen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseSeventeenMouseClicked(evt);
            }
        });

        caseEighteen.setBackground(java.awt.Color.blue);
        caseEighteen.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        caseEighteen.setForeground(new java.awt.Color(255, 255, 255));
        caseEighteen.setText("18");
        caseEighteen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseEighteenMouseClicked(evt);
            }
        });

        caseNineteen.setBackground(java.awt.Color.blue);
        caseNineteen.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        caseNineteen.setForeground(new java.awt.Color(255, 255, 255));
        caseNineteen.setText("19");
        caseNineteen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseNineteenMouseClicked(evt);
            }
        });

        caseTwenty.setBackground(java.awt.Color.blue);
        caseTwenty.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        caseTwenty.setForeground(new java.awt.Color(255, 255, 255));
        caseTwenty.setText("20");
        caseTwenty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseTwentyMouseClicked(evt);
            }
        });

        caseTwentyOne.setBackground(java.awt.Color.blue);
        caseTwentyOne.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        caseTwentyOne.setForeground(new java.awt.Color(255, 255, 255));
        caseTwentyOne.setText("21");
        caseTwentyOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseTwentyOneMouseClicked(evt);
            }
        });

        caseSix.setBackground(java.awt.Color.blue);
        caseSix.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        caseSix.setForeground(new java.awt.Color(255, 255, 255));
        caseSix.setText("6");
        caseSix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseSixMouseClicked(evt);
            }
        });

        caseSeven.setBackground(java.awt.Color.blue);
        caseSeven.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        caseSeven.setForeground(new java.awt.Color(255, 255, 255));
        caseSeven.setText("7");
        caseSeven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseSevenMouseClicked(evt);
            }
        });

        caseEight.setBackground(java.awt.Color.blue);
        caseEight.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        caseEight.setForeground(new java.awt.Color(255, 255, 255));
        caseEight.setText("8");
        caseEight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseEightMouseClicked(evt);
            }
        });

        caseNine.setBackground(java.awt.Color.blue);
        caseNine.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        caseNine.setForeground(new java.awt.Color(255, 255, 255));
        caseNine.setText("9");
        caseNine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseNineMouseClicked(evt);
            }
        });

        caseTen.setBackground(java.awt.Color.blue);
        caseTen.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        caseTen.setForeground(new java.awt.Color(255, 255, 255));
        caseTen.setText("10");
        caseTen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseTenMouseClicked(evt);
            }
        });

        caseTwentyTwo.setBackground(java.awt.Color.blue);
        caseTwentyTwo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        caseTwentyTwo.setForeground(new java.awt.Color(255, 255, 255));
        caseTwentyTwo.setText("22");
        caseTwentyTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseTwentyTwoMouseClicked(evt);
            }
        });

        caseTwentyThree.setBackground(java.awt.Color.blue);
        caseTwentyThree.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        caseTwentyThree.setForeground(new java.awt.Color(255, 255, 255));
        caseTwentyThree.setText("23");
        caseTwentyThree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseTwentyThreeMouseClicked(evt);
            }
        });

        caseTwentyFour.setBackground(java.awt.Color.blue);
        caseTwentyFour.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        caseTwentyFour.setForeground(new java.awt.Color(255, 255, 255));
        caseTwentyFour.setText("24");
        caseTwentyFour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseTwentyFourMouseClicked(evt);
            }
        });

        caseTwentyFive.setBackground(java.awt.Color.blue);
        caseTwentyFive.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        caseTwentyFive.setForeground(new java.awt.Color(255, 255, 255));
        caseTwentyFive.setText("25");
        caseTwentyFive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseTwentyFiveMouseClicked(evt);
            }
        });

        caseTwentySix.setBackground(java.awt.Color.blue);
        caseTwentySix.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        caseTwentySix.setForeground(new java.awt.Color(255, 255, 255));
        caseTwentySix.setText("26");
        caseTwentySix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseTwentySixMouseClicked(evt);
            }
        });

        caseSixteen.setBackground(java.awt.Color.blue);
        caseSixteen.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        caseSixteen.setForeground(new java.awt.Color(255, 255, 255));
        caseSixteen.setText("16");
        caseSixteen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseSixteenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(caseSix, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(caseSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(caseEight, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(caseNine, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(caseTen, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(caseOne, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(caseTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(caseThree, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(caseFour, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(caseFive, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(caseEleven, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caseTwelve, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caseThirteen, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caseFourteen, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caseFifteen, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caseSixteen, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(caseSeventeen, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caseEighteen, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caseNineteen, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caseTwenty, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caseTwentyOne, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(caseTwentyTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caseTwentyThree, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caseTwentyFour, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caseTwentyFive, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caseTwentySix, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caseThree, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caseOne, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caseTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caseFour, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caseFive, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caseEight, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caseSix, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caseSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caseNine, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caseTen, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caseThirteen, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caseEleven, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caseTwelve, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caseFourteen, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caseFifteen, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caseSixteen, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caseNineteen, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caseSeventeen, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caseEighteen, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caseTwenty, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caseTwentyOne, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caseTwentyFour, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caseTwentyTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caseTwentyThree, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caseTwentyFive, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caseTwentySix, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        file.setText("File");

        newGame.setText("New Game");
        newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameActionPerformed(evt);
            }
        });
        file.add(newGame);

        exitGame.setText("Exit Game");
        exitGame.setToolTipText("");
        exitGame.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitGameActionPerformed(evt);
            }
        });
        file.add(exitGame);

        jMenuBar1.add(file);

        offers.setText("Past Offers");
        offers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                offersMouseClicked(evt);
            }
        });
        jMenuBar1.add(offers);

        about.setText("About");
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });
        jMenuBar1.add(about);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(fourhundredLira, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(twohundredLira, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(threehundredLira, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(onehundredLira, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seventyfiveLira, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fiftyLira, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(twentyfiveLira, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fifteenLira, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tenLira, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fiveLira, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oneLira, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sevenhundredfiftyLira, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fivehundredLira, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sevenhundredfiftykLira, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(onemLira, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fivehundredkLira, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fourhundredkLira, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(threehundredkLira, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(twohundredkLira, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(onehundredkLira, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seventyfivekLira, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fiftykLira, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(twentyfivekLira, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tenkLira, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fivekLira, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(onekLira, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oneLira)
                            .addComponent(onekLira))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fiveLira)
                            .addComponent(fivekLira))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tenLira)
                            .addComponent(tenkLira))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fifteenLira)
                            .addComponent(twentyfivekLira))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(twentyfiveLira)
                            .addComponent(fiftykLira))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fiftyLira)
                            .addComponent(seventyfivekLira))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seventyfiveLira)
                            .addComponent(onehundredkLira))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(onehundredLira)
                            .addComponent(twohundredkLira))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(twohundredLira)
                            .addComponent(threehundredkLira))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(threehundredLira)
                            .addComponent(fourhundredkLira))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fourhundredLira)
                            .addComponent(fivehundredkLira))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fivehundredLira)
                            .addComponent(sevenhundredfiftykLira))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sevenhundredfiftyLira)
                            .addComponent(onemLira))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(null, "Created by Burak CELTIK\ngithub.com/fazlaejderhasiolanvarmi");
    }                                                                  

    private void offersMouseClicked(java.awt.event.MouseEvent evt) {                                    
    	JOptionPane.showMessageDialog(null, pastOffer, "Past Offers", JOptionPane.INFORMATION_MESSAGE);
    }                                                                          
    
    private void newGameActionPerformed(java.awt.event.ActionEvent evt) {                                        
    	DealOrNoDeal d = new DealOrNoDeal();
        d.setVisible(true);
        this.dispose();
    }
                                       

    private void exitGameActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	int r = JOptionPane.showConfirmDialog(null, "Do you want to exit the program?", "Exit Game", JOptionPane.OK_CANCEL_OPTION);
    	switch (r) {
     	case JOptionPane.OK_OPTION:
     		this.dispose();
     		break;
     
     	case JOptionPane.CANCEL_OPTION:
     		break;
    	}
    }                                     

    private void caseOneMouseClicked(java.awt.event.MouseEvent evt) {
    	if(turn == 1) {
    		userCase = 1;
    		s = "Your Case is Case 1";
    		label.setText(s);
    		turn++;
    		caseOne.setBackground(java.awt.Color.green);
    	}else if(userCase == 1) {
    		JOptionPane.showMessageDialog(null, "This is your case. Select another one!");
    	}else {
    		JOptionPane.showMessageDialog(null, "Case 1 has the value: " + price[0] + " TL");
        	caseOne.setEnabled(false);
        	hideValue(price[0]);
        	price[0] = 0;
        	turn++;
        	checkTurn();
    	}
    }                                    

    private void caseTwoMouseClicked(java.awt.event.MouseEvent evt) {
    	if(turn == 1) {
    		userCase = 2;
    		s = "Your Case is Case 2";
    		label.setText(s);
    		turn++;
    		caseTwo.setBackground(java.awt.Color.green);
    	}else if(userCase == 2) {
    		JOptionPane.showMessageDialog(null, "This is your case. Select another one!");
    	}else {
    		JOptionPane.showMessageDialog(null, "Case 2 has the value: " + price[1] + " TL");
        	caseTwo.setEnabled(false);
        	hideValue(price[1]);
        	price[1] = 0;
        	turn++;
        	checkTurn();
    	}
    }                                    

    private void caseThreeMouseClicked(java.awt.event.MouseEvent evt) {
    	if(turn == 1) {
    		userCase = 3;
    		s = "Your Case is Case 3";
    		label.setText(s);
    		turn++;
    		caseThree.setBackground(java.awt.Color.green);
    	}else if(userCase == 3) {
    		JOptionPane.showMessageDialog(null, "This is your case. Select another one!");
    	}else {
    		JOptionPane.showMessageDialog(null, "Case 3 has the value: " + price[2] + " TL");
        	caseThree.setEnabled(false);
        	hideValue(price[2]);
        	price[2] = 0;
        	turn++;
        	checkTurn();
    	}
    }                                      

    private void caseFourMouseClicked(java.awt.event.MouseEvent evt) {                                      
    	if(turn == 1) {
    		userCase = 4;
    		s = "Your Case is Case 4";
    		label.setText(s);
    		turn++;
    		caseFour.setBackground(java.awt.Color.green);
    	}else if(userCase == 4) {
    		JOptionPane.showMessageDialog(null, "This is your case. Select another one!");
    	}else {
    		JOptionPane.showMessageDialog(null, "Case 4 has the value: " + price[3] + " TL");
        	caseFour.setEnabled(false);
        	hideValue(price[3]);
        	price[3] = 0;
        	turn++;
        	checkTurn();
    	}
    }                                     

    private void caseFiveMouseClicked(java.awt.event.MouseEvent evt) {                                      
    	if(turn == 1) {
    		userCase = 5;
    		s = "Your Case is Case 5";
    		label.setText(s);
    		turn++;
    		caseFive.setBackground(java.awt.Color.green);
    	}else if(userCase == 5) {
    		JOptionPane.showMessageDialog(null, "This is your case. Select another one!");
    	}else {
    		JOptionPane.showMessageDialog(null, "Case 5 has the value: " + price[4] + " TL");
        	caseFive.setEnabled(false);
        	hideValue(price[4]);
        	price[4] = 0;
        	turn++;
        	checkTurn();
    	}
    }                                     

    private void caseSixMouseClicked(java.awt.event.MouseEvent evt) {                                     
    	if(turn == 1) {
    		userCase = 6;
    		s = "Your Case is Case 6";
    		label.setText(s);
    		turn++;
    		caseSix.setBackground(java.awt.Color.green);
    	}else if(userCase == 6) {
    		JOptionPane.showMessageDialog(null, "This is your case. Select another one!");
    	}else {
    		JOptionPane.showMessageDialog(null, "Case 6 has the value: " + price[5] + " TL");
        	caseSix.setEnabled(false);
        	hideValue(price[5]);
        	price[5] = 0;
        	turn++;
        	checkTurn();
    	}
    }                                    

    private void caseSevenMouseClicked(java.awt.event.MouseEvent evt) {                                       
    	if(turn == 1) {
    		userCase = 7;
    		s = "Your Case is Case 7";
    		label.setText(s);
    		turn++;
    		caseSeven.setBackground(java.awt.Color.green);
    	}else if(userCase == 7) {
    		JOptionPane.showMessageDialog(null, "This is your case. Select another one!");
    	}else {
    		JOptionPane.showMessageDialog(null, "Case 7 has the value: " + price[6] + " TL");
        	caseSeven.setEnabled(false);
        	hideValue(price[6]);
        	price[6] = 0;
        	turn++;
        	checkTurn();
    	}
    }                                      

    private void caseEightMouseClicked(java.awt.event.MouseEvent evt) {                                       
    	if(turn == 1) {
    		userCase = 8;
    		s = "Your Case is Case 8";
    		label.setText(s);
    		turn++;
    		caseEight.setBackground(java.awt.Color.green);
    	}else if(userCase == 8) {
    		JOptionPane.showMessageDialog(null, "This is your case. Select another one!");
    	}else {
    		JOptionPane.showMessageDialog(null, "Case 8 has the value: " + price[7] + " TL");
        	caseEight.setEnabled(false);
        	hideValue(price[7]);
        	price[7] = 0;
        	turn++;
        	checkTurn();
    	}
    }                                      

    private void caseNineMouseClicked(java.awt.event.MouseEvent evt) {                                      
    	if(turn == 1) {
    		userCase = 9;
    		s = "Your Case is Case 9";
    		label.setText(s);
    		turn++;
    		caseNine.setBackground(java.awt.Color.green);
    	}else if(userCase == 9) {
    		JOptionPane.showMessageDialog(null, "This is your case. Select another one!");
    	}else {
    		JOptionPane.showMessageDialog(null, "Case 9 has the value: " + price[8] + " TL");
        	caseNine.setEnabled(false);
        	hideValue(price[8]);
        	price[8] = 0;
        	turn++;
        	checkTurn();
    	}
    }                                     

    private void caseTenMouseClicked(java.awt.event.MouseEvent evt) {                                     
    	if(turn == 1) {
    		userCase = 10;
    		s = "Your Case is Case 10";
    		label.setText(s);
    		turn++;
    		caseTen.setBackground(java.awt.Color.green);
    	}else if(userCase == 10) {
    		JOptionPane.showMessageDialog(null, "This is your case. Select another one!");
    	}else {
    		JOptionPane.showMessageDialog(null, "Case 10 has the value: " + price[9] + " TL");
        	caseTen.setEnabled(false);
        	hideValue(price[9]);
        	price[9] = 0;
        	turn++;
        	checkTurn();
    	}
    }                                    

    private void caseElevenMouseClicked(java.awt.event.MouseEvent evt) {                                        
    	if(turn == 1) {
    		userCase = 11;
    		s = "Your Case is Case 11";
    		label.setText(s);
    		turn++;
    		caseEleven.setBackground(java.awt.Color.green);
    	}else if(userCase == 11) {
    		JOptionPane.showMessageDialog(null, "This is your case. Select another one!");
    	}else {
    		JOptionPane.showMessageDialog(null, "Case 11 has the value: " + price[10] + " TL");
        	caseEleven.setEnabled(false);
        	hideValue(price[10]);
        	price[10] = 0;
        	turn++;
        	checkTurn();
    	}
    }                                       

    private void caseTwelveMouseClicked(java.awt.event.MouseEvent evt) {                                        
    	if(turn == 1) {
    		userCase = 12;
    		s = "Your Case is Case 12";
    		label.setText(s);
    		turn++;
    		caseTwelve.setBackground(java.awt.Color.green);
    	}else if(userCase == 12) {
    		JOptionPane.showMessageDialog(null, "This is your case. Select another one!");
    	}else {
    		JOptionPane.showMessageDialog(null, "Case 12 has the value: " + price[11] + " TL");
        	caseTwelve.setEnabled(false);
        	hideValue(price[11]);
        	price[11] = 0;
        	turn++;
        	checkTurn();
    	}
    }                                       

    private void caseThirteenMouseClicked(java.awt.event.MouseEvent evt) {                                          
    	if(turn == 1) {
    		userCase = 13;
    		s = "Your Case is Case 13";
    		label.setText(s);
    		turn++;
    		caseThirteen.setBackground(java.awt.Color.green);
    	}else if(userCase == 13) {
    		JOptionPane.showMessageDialog(null, "This is your case. Select another one!");
    	}else {
    		JOptionPane.showMessageDialog(null, "Case 13 has the value: " + price[12] + " TL");
        	caseThirteen.setEnabled(false);
        	hideValue(price[12]);
        	price[12] = 0;
        	turn++;
        	checkTurn();
    	}
    }                                         

    private void caseFourteenMouseClicked(java.awt.event.MouseEvent evt) {                                          
    	if(turn == 1) {
    		userCase = 14;
    		s = "Your Case is Case 14";
    		label.setText(s);
    		turn++;
    		caseFourteen.setBackground(java.awt.Color.green);
    	}else if(userCase == 14) {
    		JOptionPane.showMessageDialog(null, "This is your case. Select another one!");
    	}else {
    		JOptionPane.showMessageDialog(null, "Case 14 has the value: " + price[13] + " TL");
        	caseFourteen.setEnabled(false);
        	hideValue(price[13]);
        	price[13] = 0;
        	turn++;
        	checkTurn();
    	}
    }                                         

    private void caseFifteenMouseClicked(java.awt.event.MouseEvent evt) {                                         
    	if(turn == 1) {
    		userCase = 15;
    		s = "Your Case is Case 15";
    		label.setText(s);
    		turn++;
    		caseFifteen.setBackground(java.awt.Color.green);
    	}else if(userCase == 15) {
    		JOptionPane.showMessageDialog(null, "This is your case. Select another one!");
    	}else {
    		JOptionPane.showMessageDialog(null, "Case 15 has the value: " + price[14] + " TL");
        	caseFifteen.setEnabled(false);
        	hideValue(price[14]);
        	price[14] = 0;
        	turn++;
        	checkTurn();
    	}
    }                                        

    private void caseSixteenMouseClicked(java.awt.event.MouseEvent evt) {                                         
    	if(turn == 1) {
    		userCase = 16;
    		s = "Your Case is Case 16";
    		label.setText(s);
    		turn++;
    		caseSixteen.setBackground(java.awt.Color.green);
    	}else if(userCase == 16) {
    		JOptionPane.showMessageDialog(null, "This is your case. Select another one!");
    	}else {
    		JOptionPane.showMessageDialog(null, "Case 16 has the value: " + price[15] + " TL");
        	caseSixteen.setEnabled(false);
        	hideValue(price[15]);
        	price[15] = 0;
        	turn++;
        	checkTurn();
    	}
    }                                        

    private void caseSeventeenMouseClicked(java.awt.event.MouseEvent evt) {                                           
    	if(turn == 1) {
    		userCase = 17;
    		s = "Your Case is Case 17";
    		label.setText(s);
    		turn++;
    		caseSeventeen.setBackground(java.awt.Color.green);
    	}else if(userCase == 17) {
    		JOptionPane.showMessageDialog(null, "This is your case. Select another one!");
    	}else {
    		JOptionPane.showMessageDialog(null, "Case 17 has the value: " + price[16] + " TL");
        	caseSeventeen.setEnabled(false);
        	hideValue(price[16]);
        	price[16] = 0;
        	turn++;
        	checkTurn();
    	}
    }                                          

    private void caseEighteenMouseClicked(java.awt.event.MouseEvent evt) {                                          
    	if(turn == 1) {
    		userCase = 18;
    		s = "Your Case is Case 18";
    		label.setText(s);
    		turn++;
    		caseEighteen.setBackground(java.awt.Color.green);
    	}else if(userCase == 18) {
    		JOptionPane.showMessageDialog(null, "This is your case. Select another one!");
    	}else {
    		JOptionPane.showMessageDialog(null, "Case 18 has the value: " + price[17] + " TL");
        	caseEighteen.setEnabled(false);
        	hideValue(price[17]);
        	price[17] = 0;
        	turn++;
        	checkTurn();
    	}
    }                                         

    private void caseNineteenMouseClicked(java.awt.event.MouseEvent evt) {                                          
    	if(turn == 1) {
    		userCase = 19;
    		s = "Your Case is Case 19";
    		label.setText(s);
    		turn++;
    		caseNineteen.setBackground(java.awt.Color.green);
    	}else if(userCase == 19) {
    		JOptionPane.showMessageDialog(null, "This is your case. Select another one!");
    	}else {
    		JOptionPane.showMessageDialog(null, "Case 19 has the value: " + price[18] + " TL");
        	caseNineteen.setEnabled(false);
        	hideValue(price[18]);
        	price[18] = 0;
        	turn++;
        	checkTurn();
    	}
    }                                         

    private void caseTwentyMouseClicked(java.awt.event.MouseEvent evt) {                                        
    	if(turn == 1) {
    		userCase = 20;
    		s = "Your Case is Case 20";
    		label.setText(s);
    		turn++;
    		caseTwenty.setBackground(java.awt.Color.green);
    	}else if(userCase == 20) {
    		JOptionPane.showMessageDialog(null, "This is your case. Select another one!");
    	}else {
    		JOptionPane.showMessageDialog(null, "Case 20 has the value: " + price[19] + " TL");
        	caseTwenty.setEnabled(false);
        	hideValue(price[19]);
        	price[19] = 0;
        	turn++;
        	checkTurn();
    	}
    }                                       

    private void caseTwentyOneMouseClicked(java.awt.event.MouseEvent evt) {                                           
    	if(turn == 1) {
    		userCase = 21;
    		s = "Your Case is Case 21";
    		label.setText(s);
    		turn++;
    		caseTwentyOne.setBackground(java.awt.Color.green);
    	}else if(userCase == 21) {
    		JOptionPane.showMessageDialog(null, "This is your case. Select another one!");
    	}else {
    		JOptionPane.showMessageDialog(null, "Case 21 has the value: " + price[20] + " TL");
        	caseTwentyOne.setEnabled(false);
        	hideValue(price[20]);
        	price[20] = 0;
        	turn++;
        	checkTurn();
    	}
    }                                          

    private void caseTwentyTwoMouseClicked(java.awt.event.MouseEvent evt) {                                           
    	if(turn == 1) {
    		userCase = 22;
    		s = "Your Case is Case 22";
    		label.setText(s);
    		turn++;
    		caseTwentyTwo.setBackground(java.awt.Color.green);
    	}else if(userCase == 22) {
    		JOptionPane.showMessageDialog(null, "This is your case. Select another one!");
    	}else {
    		JOptionPane.showMessageDialog(null, "Case 22 has the value: " + price[21] + " TL");
        	caseTwentyTwo.setEnabled(false);
        	hideValue(price[21]);
        	price[21] = 0;
        	turn++;
        	checkTurn();
    	}
    }                                          

    private void caseTwentyThreeMouseClicked(java.awt.event.MouseEvent evt) {                                             
    	if(turn == 1) {
    		userCase = 23;
    		s = "Your Case is Case 23";
    		label.setText(s);
    		turn++;
    		caseTwentyThree.setBackground(java.awt.Color.green);
    	}else if(userCase == 23) {
    		JOptionPane.showMessageDialog(null, "This is your case. Select another one!");
    	}else {
    		JOptionPane.showMessageDialog(null, "Case 23 has the value: " + price[22] + " TL");
        	caseTwentyThree.setEnabled(false);
        	hideValue(price[22]);
        	price[22] = 0;
        	turn++;
        	checkTurn();
    	}
    }                                            

    private void caseTwentyFourMouseClicked(java.awt.event.MouseEvent evt) {                                            
    	if(turn == 1) {
    		userCase = 24;
    		s = "Your Case is Case 24";
    		label.setText(s);
    		turn++;
    		caseTwentyFour.setBackground(java.awt.Color.green);
    	}else if(userCase == 24) {
    		JOptionPane.showMessageDialog(null, "This is your case. Select another one!");
    	}else {
    		JOptionPane.showMessageDialog(null, "Case 24 has the value: " + price[23] + " TL");
        	caseTwentyFour.setEnabled(false);
        	hideValue(price[23]);
        	price[23] = 0;
        	turn++;
        	checkTurn();
    	}
    }                                           

    private void caseTwentyFiveMouseClicked(java.awt.event.MouseEvent evt) {                                            
    	if(turn == 1) {
    		userCase = 25;
    		s = "Your Case is Case 25";
    		label.setText(s);
    		turn++;
    		caseTwentyFive.setBackground(java.awt.Color.green);
    	}else if(userCase == 25) {
    		JOptionPane.showMessageDialog(null, "This is your case. Select another one!");
    	}else {
    		JOptionPane.showMessageDialog(null, "Case 25 has the value: " + price[24] + " TL");
        	caseTwentyFive.setEnabled(false);
        	hideValue(price[24]);
        	price[24] = 0;
        	turn++;
        	checkTurn();
    	}
    }                                           

    private void caseTwentySixMouseClicked(java.awt.event.MouseEvent evt) {                                           
    	if(turn == 1) {
    		userCase = 26;
    		s = "Your Case is Case 26";
    		label.setText(s);
    		turn++;
    		caseTwentySix.setBackground(java.awt.Color.green);
    	}else if(userCase == 26) {
    		JOptionPane.showMessageDialog(null, "This is your case. Select another one!");
    	}else {
    		JOptionPane.showMessageDialog(null, "Case 26 has the value: " + price[25] + " TL");
        	caseTwentySix.setEnabled(false);
        	hideValue(price[25]);
        	price[25] = 0;
        	turn++;
        	checkTurn();
    	}
    }                                          

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DealOrNoDeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DealOrNoDeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DealOrNoDeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DealOrNoDeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DealOrNoDeal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JMenu about;
    private javax.swing.JButton caseEight;
    private javax.swing.JButton caseEighteen;
    private javax.swing.JButton caseEleven;
    private javax.swing.JButton caseFifteen;
    private javax.swing.JButton caseFive;
    private javax.swing.JButton caseFour;
    private javax.swing.JButton caseFourteen;
    private javax.swing.JButton caseNine;
    private javax.swing.JButton caseNineteen;
    private javax.swing.JButton caseOne;
    private javax.swing.JButton caseSeven;
    private javax.swing.JButton caseSeventeen;
    private javax.swing.JButton caseSix;
    private javax.swing.JButton caseSixteen;
    private javax.swing.JButton caseTen;
    private javax.swing.JButton caseThirteen;
    private javax.swing.JButton caseThree;
    private javax.swing.JButton caseTwelve;
    private javax.swing.JButton caseTwenty;
    private javax.swing.JButton caseTwentyFive;
    private javax.swing.JButton caseTwentyFour;
    private javax.swing.JButton caseTwentyOne;
    private javax.swing.JButton caseTwentySix;
    private javax.swing.JButton caseTwentyThree;
    private javax.swing.JButton caseTwentyTwo;
    private javax.swing.JButton caseTwo;
    private javax.swing.JMenuItem exitGame;
    private javax.swing.JButton fifteenLira;
    private javax.swing.JButton fiftyLira;
    private javax.swing.JButton fiftykLira;
    private javax.swing.JMenu file;
    private javax.swing.JButton fiveLira;
    private javax.swing.JButton fivehundredLira;
    private javax.swing.JButton fivehundredkLira;
    private javax.swing.JButton fivekLira;
    private javax.swing.JButton fourhundredLira;
    private javax.swing.JButton fourhundredkLira;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label;
    private javax.swing.JMenuItem newGame;
    private javax.swing.JMenu offers;
    private javax.swing.JButton oneLira;
    private javax.swing.JButton onehundredLira;
    private javax.swing.JButton onehundredkLira;
    private javax.swing.JButton onekLira;
    private javax.swing.JButton onemLira;
    private javax.swing.JButton sevenhundredfiftyLira;
    private javax.swing.JButton sevenhundredfiftykLira;
    private javax.swing.JButton seventyfiveLira;
    private javax.swing.JButton seventyfivekLira;
    private javax.swing.JButton tenLira;
    private javax.swing.JButton tenkLira;
    private javax.swing.JButton threehundredLira;
    private javax.swing.JButton threehundredkLira;
    private javax.swing.JButton twentyfiveLira;
    private javax.swing.JButton twentyfivekLira;
    private javax.swing.JButton twohundredLira;
    private javax.swing.JButton twohundredkLira;              
}
