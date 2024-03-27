public class Robot {
    private int x, y;
    public enum Direction{
        North,
        East,
        South,
        West
    }
    private Direction facing;

    public Robot() {
        this.x = 0;
        this.y = 0;
        this.facing = Direction.North;
    }

    public Robot(int starting_x, int starting_y, Direction starting_facing) {
        this.x = starting_x;
        this.y = starting_y;
        this.facing = starting_facing;
    }

    public void move() {
        if (this.facing == Direction.North) {
            x++;
        } else if (this.facing == Direction.East) {
            y++;
        } else if (this.facing == Direction.South) {
            x--;
        } else {
            y--;
        }
    }
    public void turn(Direction d) {
        this.facing = d;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public Direction getFacing() {
        return facing;
    }

    public String toString() {
        return "robot at:" + this.x + "," + this.y + " - facing:" + this.facing;
    }


}
