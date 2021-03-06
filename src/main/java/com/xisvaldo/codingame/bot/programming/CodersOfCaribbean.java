package com.xisvaldo.codingame.bot.programming;

import java.util.*;

class CodersOfCaribbean {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);

    // game loop
    while (true) {
      int myShipCount = in.nextInt(); // the number of remaining ships
      int entityCount = in.nextInt(); // the number of entities (e.g. ships, mines or cannonballs)
      List<Ship> myShips = new ArrayList<>();
      List<Ship> enemyShips = new ArrayList<>();
      List<Barrel> barrels = new ArrayList<>();

      for (int i = 0; i < entityCount; i++) {
        int entityId = in.nextInt();
        String entityType = in.next();
        int x = in.nextInt();
        int y = in.nextInt();
        int arg1 = in.nextInt();
        int arg2 = in.nextInt();
        int arg3 = in.nextInt();
        int arg4 = in.nextInt();

        if (entityType.equals("SHIP")) {
          Ship ship = new Ship(entityId, x, y, arg1, arg2, arg3, arg4);
          if (ship.isAllied)
            myShips.add(ship);
          else
            enemyShips.add(ship);
        }
        else if (entityType.equals("BARREL")) {
          Barrel barrel = new Barrel(entityId, x, y, arg1);
          barrels.add(barrel);
        }
      }

      for (Ship myShip : myShips) {
        if (myShip.getDistance(enemyShips.get(0)) < Math.pow(5, 2))
          System.out.printf("FIRE %d %d%n", enemyShips.get(0).getX(), enemyShips.get(0).getY());
        else {
          Optional<Barrel> closestBarrel =  barrels.stream().min((barrel, t1) -> barrel.getDistance(myShip));
          if (closestBarrel.isPresent()) {
            System.out.printf("MOVE %d %d%n", barrels.get(0).getX(), barrels.get(0).getY());
            myShip.setX(barrels.get(0).getX());
            myShip.setY(barrels.get(0).getY());
            barrels.remove(0);
          }
          else
            System.out.println("WAIT");
        }
      }
    }
  }
}

class Entity {
  int id;
  String type;
  int x;
  int y;

  public Entity(int id, int x, int y) {
    this.id = id;
    this.x = x;
    this.y = y;
  }

  public int getId() { return this.id; }
  public int getX() { return this.x; }
  public int getY() { return this.y; }
  public void setX(int x) { this.x = x; }
  public void setY(int y) { this.y = y; }

  public int getDistance(Entity b) {
    return (int) (Math.pow(this.x - b.getX(), 2) + Math.pow(this.y - b.getY(), 2));
  }
}

class Ship extends Entity {
  int rotationOrientation;
  int speed;
  int rumStock;
  boolean isAllied;

  public Ship(int id,
      int x,
      int y,
      int rotationOrientation,
      int speed,
      int rumStock,
      int isAllied) {

    super(id, x, y);
    this.rotationOrientation = rotationOrientation;
    this.speed = speed;
    this.rumStock = rumStock;
    this.isAllied = isAllied == 1 ? true : false;
  }

  public int getRotationOrientation() { return this.rotationOrientation; }
  public int getSpeed() { return this.speed; }
  public int getRumStock() { return this.rumStock; }
  public boolean isAllied() { return this.isAllied; }
  public void addRumStock(int quantity) { this.rumStock = quantity; }
}

class Barrel extends Entity {
  int amount;

  public Barrel(int id, int x, int y, int amount) {
    super(id, x, y);
    this.amount = amount;
  }

  public int getAmount() { return this.amount; }
}
