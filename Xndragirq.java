public class Xndragirq {

    public static void main(String[] args) {

        //51-70 201-230 231-250 251-260 ☺

        {
            int x = 122;
            {
                boolean b = x / 100 == x % 10;
                System.out.println("51 : " + b);
            }//51

            {
                int a = x / 100,
                        b = x / 10 % 10,
                        c = x % 10;
                boolean bol = a == b || a == c || b == c;
                System.out.println("52 : " + bol);
            }//52

            {
                int k = 100;
                System.out.println("53 : " + (x > k ?
                        x / (x / 100 + x / 10 % 10 + x % 10) :
                        x / (x % 10))
                );
            }//53

            {
                int a = x / 100,
                        b = x / 10 % 10,
                        c = x % 10;
                System.out.println("54 : " + (a > b && a > c ? a :
                        b > c ? b :
                                c)
                );
            }//54

            {
                int a = x / 100,
                        b = x / 10 % 10,
                        c = x % 10;
                System.out.println("55 : " + (a < b && a < c ? a :
                        b < c ? b :
                                c)
                );
            }//55

            {
                System.out.println("56 : " + (x % 10 > x / 10 % 10 ?
                        x / (x / 100 + x / 10 % 10 + x % 10) : x
                ));
            }//56

            {
                System.out.println("57 : " + (x > 300 ?
                        (x / 10 % 10) / (x % 10) :
                        (x / 100) / (x % 10))
                );
            }//57

            {
                char f = x / 100 + x / 10 % 10 < 5 ? 'a' : 'b';
                System.out.println("58 : " + f);
            }//58

            {
                int a = x / 100,
                        b = x / 10 % 10,
                        c = x % 10;
                System.out.print("59 : ");
                if (a < b && a < c) {
                    System.out.println(a + " " + (
                            b < c ? b + " " + c :
                                    c + " " + b
                    ));
                } else if (b < c) {
                    System.out.println(b + " " + (
                            a < c ? a + " " + c :
                                    c + " " + a
                    ));
                } else {
                    System.out.println(c + " " + (
                            a < b ? a + " " + b :
                                    b + " " + a
                    ));
                }
            }//59

            {
                int a = x / 100,
                        b = x / 10 % 10,
                        c = x % 10;
                System.out.print("60 : ");
                if (a > b && a > c) {
                    System.out.println(a + " " + (
                            b > c ? b + " " + c :
                                    c + " " + b
                    ));
                } else if (b > c) {
                    System.out.println(b + " " + (
                            a > c ? a + " " + c :
                                    c + " " + a
                    ));
                } else {
                    System.out.println(c + " " + (
                            a > b ? a + " " + b :
                                    b + " " + a
                    ));
                }
            }//60
        }//51 - 60

        {
            int x = 5418;
            {
                boolean t = x % 10 + x / 10 % 10 == x / 100 % 10 + x / 1000;
                System.out.println("61 : " + t);
            }//61

            {
                System.out.println("62 : " + (x < 5000 ?
                        x / (x / 100 % 10 + x % 10) :
                        x / (x / 1000 + x / 10 % 10)
                ));
            }//62

            {
                System.out.println("63 : " + (x % 10 == 1 ||
                        x / 10 % 10 == 1 ||
                        x / 100 % 10 == 1 ||
                        x / 1000 % 10 == 1 ? 1 : 0
                ));
            }//63

            {
                char y = x % 10 + x / 10 % 10 == 5 ? 's' : 'd';
                System.out.println("61 : " + y);
            }//64

            {
                System.out.println("65 : " + ((x % 10) * (x / 10 % 10) == 12 ?
                        "y=12" : "y=0"));
            }//65

            {
                System.out.println("66 : " + (x / 1000 == 4 ||
                        x % 10 == 4 ? "YES" : "NO"));
            }//66

            {
                System.out.println("67 : " + "NO");
            }//67

            {
                System.out.println("68 : " + (x % 10 > x / 10 % 10 ?
                        (x % 10) * (x / 100 % 10) : 1
                ));
            }//68

            {
                int y = x % 10 +
                        x / 10 % 10 +
                        x / 100 % 10 +
                        x / 1000 > 20 ? 1 : 0;
                System.out.println("69 : " + y);
            }//69

            {
                int y = (x % 10) *
                        (x / 10 % 10) *
                        (x / 100 % 10) *
                        (x / 1000) > 200 ? 0 : 1;
                System.out.println("70 : " + y);
            }//70
        }//61 - 70

        {
            int n = 45987513;
            {
                int count = 0;
                int x = n;
                while (x > 0) {
                    x /= 10;
                    count++;
                }
                System.out.println("201 : " + count);
            }//201

            {
                int x = n;
                int sum = 0;
                while (x > 0) {
                    sum += x % 10;
                    x /= 10;
                }
                System.out.println("202 : " + sum);
            }//202

            {
                int x = n;
                int sum = 1;
                while (x > 0) {
                    sum *= x % 10;
                    x /= 10;
                }
                System.out.println("203 : " + sum);
            }//203

            {
                int x = n;
                System.out.print("204 : ");
                while (x > 0) {
                    System.out.print(x % 10 + " ");
                    x /= 10;
                }
                System.out.println();
            }//204

            {
                int x = n;
                int y = 0;
                while (x > 0) {
                    y = y * 10 + x % 10;
                    x /= 10;
                }

                System.out.print("205 : ");
                while (y > 0) {
                    System.out.print(y % 10 + " ");
                    y /= 10;
                }
                System.out.println();
            }//205

            {
                int x = n;
                int y = 0;
                System.out.print("206 : ");
                while (x > 0) {
                    y = y * 10 + x % 10;
                    x /= 10;
                }
                System.out.println(y);
            }//206

            {
                int x = n;
                boolean b = false;
                while (x > 0) {
                    if (x % 10 == 2) b = true;
                    x /= 10;
                }
                System.out.println("207 : " + b);
            }//207

            {
                int x = n;
                int y = x % 10;
                boolean b = true;
                while (x > 0) {
                    if (y != x % 10) b = false;
                    x /= 10;
                }
                System.out.println("208 : " + b);
            }//208

            {
                int x = n;
                boolean b = false;
                while (x > 0) {
                    if (x % 2 == 1) {
                        b = true;
                        break;
                    }
                    x /= 10;
                }
                System.out.println("209 : " + b);
            }//209

            {
                int x = n;
                boolean b = true;
                int kent = 0, zuyg = 0;
                while (x > 0) {
                    b = !b;
                    if (b) kent += x % 10;
                    else zuyg += x % 10;
                    x /= 10;
                }
                System.out.println("210 : " + (kent == zuyg));
            }//210

        }//201 - 210

        {
            int[] arr = {5, 4, 9, 8, 3, 0, 1, -8, -2, -3};
            {
                int count = 0;
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 == 0) {
                        count++;
                        sum += arr[i];
                    }
                }
                System.out.println("211 : " + sum / count);
            }//211

            {
                int count = 0;
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 == 0) {
                        count++;
                        sum += arr[i] * arr[i];
                    }
                }
                System.out.println("212 : " + Math.sqrt(sum / count));
            }//212

            {
                int count = 0;
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 == 1) {
                        count++;
                        sum += arr[i] * arr[i];
                    }
                }
                System.out.println("213 : " + Math.sqrt(sum / count));
            }//213

            {
                int count = 0;
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 == 1) {
                        count++;
                        sum += arr[i];
                    }
                }
                System.out.println("214 : " + sum / count);
            }//214

            {
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (i % 2 == 0) {
                        sum += arr[i];
                    }
                }
                System.out.println("215 : " + sum);
            }//215

            {
                int sum = 1;
                for (int i = 0; i < arr.length; i++) {
                    if (i % 2 == 0) {
                        sum *= arr[i];
                    }
                }
                System.out.println("216 : " + sum);
            }//216

            {
                int sum = 1;
                for (int i = 0; i < arr.length; i++) {
                    if (i % 2 == 1) {
                        sum *= arr[i] * arr[i];
                    }
                }
                System.out.println("217 : " + sum);
            }//217

            {
                int sum = 1;
                for (int i = 0; i < arr.length; i++) {
                    if (i % 2 == 1) {
                        sum *= arr[i] * arr[i];
                    }
                }
                System.out.println("218 : " + sum);
            }//218

            {
                int k = 3;
                int count = 0;
                while (k * ++count < arr.length) ;
                System.out.println("219 : " + --count);
            }//219

            {
                int drakanCount = 0;
                int bacasakanCount = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] >= 0) drakanCount++;
                    else bacasakanCount++;
                }
                System.out.println("220 : drakan tver : " + drakanCount +
                        "    bacasakan tver : " + bacasakanCount);
            }//220

            {
                int a = 1, b = 8, sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] >= a && arr[i] <= b) sum += arr[i];
                }
                System.out.println("221 : " + sum);
            }//221

            {
                int a = 1, b = 8, sum = 1;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] >= a && arr[i] <= b) sum *= arr[i];
                }
                System.out.println("222 : " + sum);
            }//222

            {
                int a = 1, b = 8, count = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] >= a && arr[i] <= b) count++;
                }
                System.out.println("213 : " + count);
            }//223

            {
                int k = 6;
                int sum = 1;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] < k && arr[i] > -k) sum += arr[i] * arr[i] * arr[i];
                }
                System.out.println("224 : " + sum);
            }//224

            {
                int t = 7;
                int sum = 1;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] < t && arr[i] > -t) sum *= arr[i];
                }
                System.out.println("225 : " + sum);
            }//225

            {
                int k = 6;
                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] < k && arr[i] > -k) count++;
                }
                System.out.println("226 : " + count);
            }//226

            {
                int k = 3;
                int count = 0;
                int sum = 0;
                while (k * ++count < arr.length) {
                    sum += arr[k * count];
                }
                System.out.println("227 : " + sum / --count);
            }//227

            {
                int k = 2;
                int count = 0;
                int sum = 0;
                while (k * ++count < arr.length) {
                    sum += arr[k * count];
                }
                System.out.println("228 : " + sum / --count);
            }//228

            {
                int sum = 1;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > i) sum *= arr[i];
                }
                System.out.println("229 : " + sum);
            }//229

            {
                int k = 3;
                int sum = 1;
                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % k == 0) {
                        sum += arr[i] * arr[i];
                        count++;
                    }
                }
                System.out.println("230 : " + Math.sqrt((double) sum / count));
            }//230

        }//211 - 230

        {
            int[] arr = {5, 4, 3, 8, 6, 9, 1, 2};
            {
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 == 0) sum += arr[i] * arr[i];
                }
                System.out.println("231 : " + sum);
            }//231

            {
                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 == 0) count++;
                }
                System.out.println("232 : " + count);
            }//232

            {
                int sum = 0;
                int artadryal = 1;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 == 0) {
                        sum += arr[i];
                        artadryal *= arr[i];
                    }
                }
                System.out.println("233 : gumar " + sum +
                        "   artadryal " + artadryal);
            }//233

            {
                int sum = 0;
                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 == 1) {
                        sum += arr[i];
                        count++;
                    }
                }
                System.out.println("233 : " + sum / count);
            }//234

            {
                int sum = 1;
                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 == 1) {
                        sum *= arr[i];
                        count++;
                    }
                }
                System.out.println("233 : " + sum / count);
            }//235

            {
                int sum = 1;
                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 == 1) {
                        sum *= arr[i];
                        count++;
                    }
                }
                System.out.println("236 : artadryal " + sum
                        + "  qanak " + count);
            }//236

            {
                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == 0) {
                        count++;
                    }
                }
                System.out.println("237 : " + count);
            }//237

            {
                int sum = 0;
                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 3 == 0) {
                        sum += arr[i];
                        count++;
                    }
                }
                System.out.println("238 : " + sum / count);
            }//238

            {
                int sum = 1;
                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 5 == 0) {
                        sum *= arr[i];
                        count++;
                    }
                }
                System.out.println("239 : " + sum / count);
            }//239

            {
                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 7 == 0) {
                        count++;
                    }
                }
                System.out.println("240 : " + count);
            }//240

            {
                int k = 3;
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % k == 0) {
                        sum += arr[i];
                    }
                }
                System.out.println("241 : " + sum);
            }//241

            {
                int m = 2;
                int sum = 1;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % m == 0) {
                        sum *= arr[i];
                    }
                }
                System.out.println("242 : " + sum);
            }//242

            {
                int t = 4;
                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % t == 0) {
                        count++;
                    }
                }
                System.out.println("243 : " + count);
            }//243

            {
                int sum = 1;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 5 == 3) {
                        sum *= arr[i];
                    }
                }
                System.out.println("244 : " + sum);
            }//244

            {
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    if ((arr[i] + i) % 3 == 0) {
                        sum += arr[i] * arr[i];
                    }
                }
                System.out.println("245 : " + sum);
            }//245

            {
                int sum = 0;
                int count = 0;
                for (int i = 1; i * i < arr.length; i++) {
                    sum += arr[i];
                    count++;
                }
                System.out.println("246 : " + sum / count);
            }//246

            {
                int sum = 0;
                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > i) {
                        sum += arr[i] * arr[i];
                        count++;
                    }
                }
                System.out.println("247 : " + sum / count);
            }//247

            {
                int k = 3;
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    if ((arr[i] + i) * (arr[i] + i) % k == 0) {
                        sum += arr[i];
                    }
                }
                System.out.println("248 : " + sum);
            }//248

            {
                int k = 4;
                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    if ((arr[i] - i) > k) {
                        count++;
                    }
                }
                System.out.println("249 : " + count);
            }//249

            {
                int sum = 1;
                for (int i = 0; i < arr.length; i++) {
                    if ((arr[i] * i) % 3 == 2) {
                        sum *= arr[i] * arr[i];
                    }
                }
                System.out.println("250 : " + sum);
            }//250

        }//231 - 250

        {
            int[] arr = {7, 8, 9, 1, 2, 3, 4, 5, 6};

            {
                int max = arr[0];
                for (int i = 0; i < arr.length; i++) {
                    if (max < arr[i]) max = arr[i];
                }
                System.out.println("251 : " + max);
            }//251

            {
                int min = arr[0];
                for (int i = 0; i < arr.length; i++) {
                    if (min > arr[i]) min = arr[i];
                }
                System.out.println("252 : " + min);
            }//252

            {
                int min = arr[0];
                int max = arr[0];
                for (int i = 0; i < arr.length; i++) {
                    if (min > arr[i]) min = arr[i];
                    if (max < arr[i]) max = arr[i];
                }
                System.out.println("253 : " + (min + max));
            }//253

            {
                int min = arr[0];
                int max = arr[0];
                for (int i = 0; i < arr.length; i++) {
                    if (min > arr[i]) min = arr[i];
                    if (max < arr[i]) max = arr[i];
                }
                System.out.println("254 : " + min * max);
            }//254

            {
                int index = 0;
                int max = arr[0];
                for (int i = 0; i < arr.length; i++) {
                    if (max < arr[i]) {
                        max = arr[i];
                        index = i;
                    }
                }
                System.out.println("255 : " + (index + max));
            }//255

            {
                int index = 0;
                int min = arr[0];
                for (int i = 0; i < arr.length; i++) {
                    if (min > arr[i]) {
                        min = arr[i];
                        index = i;
                    }
                }
                System.out.println("256 : " + (index + min));
            }//256

            {
                int index = 0;
                int max = arr[0];
                for (int i = 0; i < arr.length; i++) {
                    if (max < arr[i]) {
                        max = arr[i];
                        index = i;
                    }
                }
                System.out.println("257 : " + index);
            }//257

            {
                int index = 0;
                int max = arr[0];
                for (int i = 0; i < arr.length; i++) {
                    if (max <= arr[i]) {
                        max = arr[i];
                        index = i;
                    }
                }
                System.out.println("258 : " + index);
            }//258

            {
                int index = 0;
                int min = arr[0];
                for (int i = 0; i < arr.length; i++) {
                    if (min > arr[i]) {
                        min = arr[i];
                        index = i;
                    }
                }
                System.out.println("259 : " + index);
            }//259

            {
                int index = 0;
                int min = arr[0];
                for (int i = 0; i < arr.length; i++) {
                    if (min >= arr[i]) {
                        min = arr[i];
                        index = i;
                    }
                }
                System.out.println("260 : " + index);
            }//260

        }//251 - 260

    }
}






