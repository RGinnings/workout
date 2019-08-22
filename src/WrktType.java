
public class WrktType {

    static String move1;
    static String move2;
    static String move3;
    static String move4;
    static String move5;
    static String move6;
    static String move7;

    WrktType(String[] pok) {
        //pok[2] move 1
        if ("Water".equalsIgnoreCase(pok[2])) {
            move1 = "Rest";
            move2 = "  ";
            move3 = "  ";
            move4 = "  ";
            move5 = "  ";
            move6 = "  ";
            move7 = "  ";
        } else if ("Dragon".equalsIgnoreCase(pok[2]) || "Fairy".equalsIgnoreCase(pok[2])) {
            move1 = "Full Body";
            move2 = "  ";
            move3 = "  ";
            move4 = "  ";
            move5 = "  ";
            move6 = "  ";
            move7 = "  ";
        } else {
            if ("Normal".equalsIgnoreCase(pok[2]) || "Steel".equalsIgnoreCase(pok[2])) {
                move1 = ("Chest");
            }
            if ("Grass".equalsIgnoreCase(pok[2]) || "Fire".equalsIgnoreCase(pok[2])) {
                move1 = ("Core");
            }
            if ("Rock".equalsIgnoreCase(pok[2]) || "Ghost".equalsIgnoreCase(pok[2])) {
                move1 = ("Triceps");
            }
            if ("Ice".equalsIgnoreCase(pok[2]) || "Poison".equalsIgnoreCase(pok[2])) {
                move1 = ("Butt");
            }
            if ("Flying".equalsIgnoreCase(pok[2])) {
                move1 = ("Cardio");
            }
            if ("Ground".equalsIgnoreCase(pok[2]) || "Fighting".equalsIgnoreCase(pok[2])) {
                move1 = ("Back");
            }
            if ("Psychic".equalsIgnoreCase(pok[2]) || "Bug".equalsIgnoreCase(pok[2])) {
                move1 = ("Biceps");
            }
            if ("Electric".equalsIgnoreCase(pok[2]) || "Dark".equalsIgnoreCase(pok[2])) {
                move1 = ("Legs");
            }

            //pok[3] move 2
            if (!"".equalsIgnoreCase(pok[3])) {
                move2 = "";
                if ("Water".equalsIgnoreCase(pok[3])) {
                    move1 = "Rest";
                    move2 = "  ";
                    move3 = "  ";
                    move4 = "  ";
                    move5 = "  ";
                    move6 = "  ";
                    move7 = "  ";
                } else if ("Dragon".equalsIgnoreCase(pok[3]) || "Fairy".equalsIgnoreCase(pok[3])) {
                    move1 = "Full Body";
                    move2 = "  ";
                    move3 = "  ";
                    move4 = "  ";
                    move5 = "  ";
                    move6 = "  ";
                    move7 = "  ";
                } else {
                    if ("Normal".equalsIgnoreCase(pok[3]) || "Steel".equalsIgnoreCase(pok[3])) {
                        move2 = (" & Chest");
                    }
                    if ("Grass".equalsIgnoreCase(pok[3]) || "Fire".equalsIgnoreCase(pok[3])) {
                        move2 = (" & Core");
                    }
                    if ("Rock".equalsIgnoreCase(pok[3]) || "Ghost".equalsIgnoreCase(pok[3])) {
                        move2 = (" & Triceps");
                    }
                    if ("Ice".equalsIgnoreCase(pok[3]) || "Poison".equalsIgnoreCase(pok[3])) {
                        move2 = (" & Butt");
                    }
                    if ("Flying".equalsIgnoreCase(pok[3])) {
                        move2 = (" & Cardio");
                    }
                    if ("Ground".equalsIgnoreCase(pok[3]) || "Fighting".equalsIgnoreCase(pok[3])) {
                        move2 = (" & Back");
                    }
                    if ("Psychic".equalsIgnoreCase(pok[3]) || "Bug".equalsIgnoreCase(pok[3])) {
                        move2 = (" & Biceps");
                    }
                    if ("Electric".equalsIgnoreCase(pok[3]) || "Dark".equalsIgnoreCase(pok[3])) {
                        move2 = (" & Legs");
                    }

                    //pok[4] move 3
                    if (!"".equalsIgnoreCase(pok[4])) {
                        move3 = "";
                        if ("Water".equalsIgnoreCase(pok[4])) {
                            move1 = "Rest";
                            move2 = "  ";
                            move3 = "  ";
                            move4 = "  ";
                            move5 = "  ";
                            move6 = "  ";
                            move7 = "  ";
                        } else if ("Dragon".equalsIgnoreCase(pok[4]) || "Fairy".equalsIgnoreCase(pok[4])) {
                            move1 = "Full Body";
                            move2 = "  ";
                            move3 = "  ";
                            move4 = "  ";
                            move5 = "  ";
                            move6 = "  ";
                            move7 = "  ";
                        } else {
                            if ("Normal".equalsIgnoreCase(pok[4]) || "Steel".equalsIgnoreCase(pok[4])) {
                                move3 = (" & Chest");
                            }
                            if ("Grass".equalsIgnoreCase(pok[4]) || "Fire".equalsIgnoreCase(pok[4])) {
                                move3 = (" & Core");
                            }
                            if ("Rock".equalsIgnoreCase(pok[4]) || "Ghost".equalsIgnoreCase(pok[4])) {
                                move3 = (" & Triceps");
                            }
                            if ("Ice".equalsIgnoreCase(pok[4]) || "Poison".equalsIgnoreCase(pok[4])) {
                                move3 = (" & Butt");
                            }
                            if ("Flying".equalsIgnoreCase(pok[4])) {
                                move3 = (" & Cardio");
                            }
                            if ("Ground".equalsIgnoreCase(pok[4]) || "Fighting".equalsIgnoreCase(pok[4])) {
                                move3 = (" & Back");
                            }
                            if ("Psychic".equalsIgnoreCase(pok[4]) || "Bug".equalsIgnoreCase(pok[4])) {
                                move3 = (" & Biceps");
                            }
                            if ("Electric".equalsIgnoreCase(pok[4]) || "Dark".equalsIgnoreCase(pok[4])) {
                                move3 = (" & Legs");
                            }

                            //pok[5] move 4
                            if (!"".equalsIgnoreCase(pok[5])) {
                                move4 = "";
                                if ("Water".equalsIgnoreCase(pok[5])) {
                                    move1 = "Rest";
                                    move2 = "  ";
                                    move3 = "  ";
                                    move4 = "  ";
                                    move5 = "  ";
                                    move6 = "  ";
                                    move7 = "  ";
                                } else if ("Dragon".equalsIgnoreCase(pok[5]) || "Fairy".equalsIgnoreCase(pok[5])) {
                                    move1 = "Full Body";
                                    move2 = "  ";
                                    move3 = "  ";
                                    move4 = "  ";
                                    move5 = "  ";
                                    move6 = "  ";
                                    move7 = "  ";
                                } else {
                                    if ("Normal".equalsIgnoreCase(pok[5]) || "Steel".equalsIgnoreCase(pok[5])) {
                                        move4 = (" & Chest");
                                    }
                                    if ("Grass".equalsIgnoreCase(pok[5]) || "Fire".equalsIgnoreCase(pok[5])) {
                                        move4 = (" & Core");
                                    }
                                    if ("Rock".equalsIgnoreCase(pok[5]) || "Ghost".equalsIgnoreCase(pok[5])) {
                                        move4 = (" & Triceps");
                                    }
                                    if ("Ice".equalsIgnoreCase(pok[5]) || "Poison".equalsIgnoreCase(pok[5])) {
                                        move4 = (" & Butt");
                                    }
                                    if ("Flying".equalsIgnoreCase(pok[5])) {
                                        move4 = (" & Cardio");
                                    }
                                    if ("Ground".equalsIgnoreCase(pok[5]) || "Fighting".equalsIgnoreCase(pok[5])) {
                                        move4 = (" & Back");
                                    }
                                    if ("Psychic".equalsIgnoreCase(pok[5]) || "Bug".equalsIgnoreCase(pok[5])) {
                                        move4 = (" & Biceps");
                                    }
                                    if ("Electric".equalsIgnoreCase(pok[5]) || "Dark".equalsIgnoreCase(pok[5])) {
                                        move4 = (" & Legs");
                                    }

                                    //pok[6] move 5
                                    if (!"".equalsIgnoreCase(pok[6])) {
                                        move5 = "";
                                        if ("Water".equalsIgnoreCase(pok[6])) {
                                            move1 = "Rest";
                                            move2 = "  ";
                                            move3 = "  ";
                                            move4 = "  ";
                                            move5 = "  ";
                                            move6 = "  ";
                                            move7 = "  ";
                                        } else if ("Dragon".equalsIgnoreCase(pok[6]) || "Fairy".equalsIgnoreCase(pok[6])) {
                                            move1 = "Full Body";
                                            move2 = "  ";
                                            move3 = "  ";
                                            move4 = "  ";
                                            move5 = "  ";
                                            move6 = "  ";
                                            move7 = "  ";
                                        } else {
                                            if ("Normal".equalsIgnoreCase(pok[6]) || "Steel".equalsIgnoreCase(pok[6])) {
                                                move5 = (" & Chest");
                                            }
                                            if ("Grass".equalsIgnoreCase(pok[6]) || "Fire".equalsIgnoreCase(pok[6])) {
                                                move5 = (" & Core");
                                            }
                                            if ("Rock".equalsIgnoreCase(pok[6]) || "Ghost".equalsIgnoreCase(pok[6])) {
                                                move5 = (" & Triceps");
                                            }
                                            if ("Ice".equalsIgnoreCase(pok[6]) || "Poison".equalsIgnoreCase(pok[6])) {
                                                move5 = (" & Butt");
                                            }
                                            if ("Flying".equalsIgnoreCase(pok[6])) {
                                                move5 = (" & Cardio");
                                            }
                                            if ("Ground".equalsIgnoreCase(pok[6]) || "Fighting".equalsIgnoreCase(pok[6])) {
                                                move5 = (" & Back");
                                            }
                                            if ("Psychic".equalsIgnoreCase(pok[6]) || "Bug".equalsIgnoreCase(pok[6])) {
                                                move5 = (" & Biceps");
                                            }
                                            if ("Electric".equalsIgnoreCase(pok[6]) || "Dark".equalsIgnoreCase(pok[6])) {
                                                move5 = (" & Legs");
                                            }

                                            //pok[7] move 6
                                            if (!"".equalsIgnoreCase(pok[7])) {
                                                move6 = "";
                                                if ("Water".equalsIgnoreCase(pok[7])) {
                                                    move1 = "Rest";
                                                    move2 = "  ";
                                                    move3 = "  ";
                                                    move4 = "  ";
                                                    move5 = "  ";
                                                    move6 = "  ";
                                                    move7 = "  ";
                                                } else if ("Dragon".equalsIgnoreCase(pok[7]) || "Fairy".equalsIgnoreCase(pok[7])) {
                                                    move1 = "Full Body";
                                                    move2 = "  ";
                                                    move3 = "  ";
                                                    move4 = "  ";
                                                    move5 = "  ";
                                                    move6 = "  ";
                                                    move7 = "  ";
                                                } else {
                                                    if ("Normal".equalsIgnoreCase(pok[7]) || "Steel".equalsIgnoreCase(pok[7])) {
                                                        move6 = (" & Chest");
                                                    }
                                                    if ("Grass".equalsIgnoreCase(pok[7]) || "Fire".equalsIgnoreCase(pok[7])) {
                                                        move6 = (" & Core");
                                                    }
                                                    if ("Rock".equalsIgnoreCase(pok[7]) || "Ghost".equalsIgnoreCase(pok[7])) {
                                                        move6 = (" & Triceps");
                                                    }
                                                    if ("Ice".equalsIgnoreCase(pok[7]) || "Poison".equalsIgnoreCase(pok[7])) {
                                                        move6 = (" & Butt");
                                                    }
                                                    if ("Flying".equalsIgnoreCase(pok[7])) {
                                                        move6 = (" & Cardio");
                                                    }
                                                    if ("Ground".equalsIgnoreCase(pok[7]) || "Fighting".equalsIgnoreCase(pok[7])) {
                                                        move6 = (" & Back");
                                                    }
                                                    if ("Psychic".equalsIgnoreCase(pok[7]) || "Bug".equalsIgnoreCase(pok[7])) {
                                                        move6 = (" & Biceps");
                                                    }
                                                    if ("Electric".equalsIgnoreCase(pok[7]) || "Dark".equalsIgnoreCase(pok[7])) {
                                                        move6 = (" & Legs");
                                                    }

                                                    //pok[8] move 7
                                                    if (!"".equalsIgnoreCase(pok[8])) {
                                                        move7 = "";
                                                        if ("Water".equalsIgnoreCase(pok[8])) {
                                                            move1 = "Rest";
                                                            move2 = "  ";
                                                            move3 = "  ";
                                                            move4 = "  ";
                                                            move5 = "  ";
                                                            move6 = "  ";
                                                            move7 = "  ";
                                                        } else if ("Dragon".equalsIgnoreCase(pok[8]) || "Fairy".equalsIgnoreCase(pok[8])) {
                                                            move1 = "Full Body";
                                                            move2 = "  ";
                                                            move3 = "  ";
                                                            move4 = "  ";
                                                            move5 = "  ";
                                                            move6 = "  ";
                                                            move7 = "  ";
                                                        } else {
                                                            if ("Normal".equalsIgnoreCase(pok[8]) || "Steel".equalsIgnoreCase(pok[8])) {
                                                                move7 = (" & Chest");
                                                            }
                                                            if ("Grass".equalsIgnoreCase(pok[8]) || "Fire".equalsIgnoreCase(pok[8])) {
                                                                move7 = (" & Core");
                                                            }
                                                            if ("Rock".equalsIgnoreCase(pok[8]) || "Ghost".equalsIgnoreCase(pok[8])) {
                                                                move7 = (" & Triceps");
                                                            }
                                                            if ("Ice".equalsIgnoreCase(pok[8]) || "Poison".equalsIgnoreCase(pok[8])) {
                                                                move7 = (" & Butt");
                                                            }
                                                            if ("Flying".equalsIgnoreCase(pok[8])) {
                                                                move7 = (" & Cardio");
                                                            }
                                                            if ("Ground".equalsIgnoreCase(pok[8]) || "Fighting".equalsIgnoreCase(pok[8])) {
                                                                move7 = (" & Back");
                                                            }
                                                            if ("Psychic".equalsIgnoreCase(pok[8]) || "Bug".equalsIgnoreCase(pok[8])) {
                                                                move7 = (" & Biceps");
                                                            }
                                                            if ("Electric".equalsIgnoreCase(pok[8]) || "Dark".equalsIgnoreCase(pok[8])) {
                                                                move7 = (" & Legs");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
