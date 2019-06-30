class Point {
        int x, y;

        Point(int x, int y) {

            this.x = x;

            this.y = y;

        }

        double distance(int x, int y) {

            int dx = this.x - x;

            int dy = this.y - y;

            return Math.sqrt(dx * dx + dy * dy);

        }

        double distance(Point p) {

            return distance(p.x, p.y);

        }
    }

    class PointDistance {

        public static void main(String [] args) {

            Point p1 = new Point(0, 0);

            Point p2 = new Point(30, 40);

            System.out.println("p1 = " + p1.x + ", " + p1.y);

            System.out.println("p2 = " + p2.x + ", " + p2.y);

            System.out.println("p1.distance(p2) = " + p1.distance(p2));

            System.out.println("p1.distance(60, 80) = " + p1.distance(60, 80));

        }
    }
