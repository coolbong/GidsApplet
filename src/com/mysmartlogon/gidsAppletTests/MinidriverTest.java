package com.mysmartlogon.gidsAppletTests;

import org.junit.Before;
import org.junit.Test;

public class MinidriverTest extends GidsBaseTestClass {

    @Before
    public void setUp() throws Exception {
        super.setUp();
        createcard();
    }

    @Test
    public void readEmptyCard() {
        execute("00 A4 04 00 09 A0 00 00 03 08 00 00 10 00", 0x6A82);
        execute("00 A4 00 0C 02 3F FF");
        execute("00 A4 04 00 09 A0 00 00 03 97 42 54 46 59 00", "61 12 4F 0B A0 00 00 03 97 42 54 46 59 02 01 73 03 40 01 C0 90 00");
        execute("00 CB 3F FF 04 5C 02 7F 73 00", 0x6A88);
        execute("00 CB A0 00 04 5C 02 DF 1F 00",
                "DF 1F 81 8D 01 6D 73 63 70 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 A0 00 00 00 00 00 00 00 00 00 00 00 63 61 72 64 69 64 00 00 00 00 00 20 DF 00 00 12 A0 00 00 00 00 00 00 00 00 00 00 00 63 61 72 64 61 70 70 73 00 00 00 21 DF 00 00 10 A0 00 00 00 00 00 00 00 00 00 00 00 63 61 72 64 63 66 00 00 00 00 00 22 DF 00 00 10 A0 00 00 6D 73 63 70 00 00 00 00 00 63 6D 61 70 66 69 6C 65 00 00 00 23 DF 00 00 10 A0 00 00 90 00");
//		execute("00 CB A0 12 04 5C 02 DF 20 00",
//				"DF 20 10 A7 F5 C7 42 89 55 7B C0 7E 9A 9D E3 DD BD 21 D7 90 00");
        execute("00 CB A0 00 04 5C 02 DF 1F 00",
                "DF 1F 81 8D 01 6D 73 63 70 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 A0 00 00 00 00 00 00 00 00 00 00 00 63 61 72 64 69 64 00 00 00 00 00 20 DF 00 00 12 A0 00 00 00 00 00 00 00 00 00 00 00 63 61 72 64 61 70 70 73 00 00 00 21 DF 00 00 10 A0 00 00 00 00 00 00 00 00 00 00 00 63 61 72 64 63 66 00 00 00 00 00 22 DF 00 00 10 A0 00 00 6D 73 63 70 00 00 00 00 00 63 6D 61 70 66 69 6C 65 00 00 00 23 DF 00 00 10 A0 00 00 90 00");
        execute("00 CB A0 10 04 5C 02 DF 22 00 ",
                "DF 22 06 00 00 00 00 00 00 90 00 ");
        execute("00 CB A0 00 04 5C 02 DF 1F 00",
                "DF 1F 81 8D 01 6D 73 63 70 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 A0 00 00 00 00 00 00 00 00 00 00 00 63 61 72 64 69 64 00 00 00 00 00 20 DF 00 00 12 A0 00 00 00 00 00 00 00 00 00 00 00 63 61 72 64 61 70 70 73 00 00 00 21 DF 00 00 10 A0 00 00 00 00 00 00 00 00 00 00 00 63 61 72 64 63 66 00 00 00 00 00 22 DF 00 00 10 A0 00 00 6D 73 63 70 00 00 00 00 00 63 6D 61 70 66 69 6C 65 00 00 00 23 DF 00 00 10 A0 00 00 90 00");
        execute("00 CB A0 10 04 5C 02 DF 23 00 ",
                "DF 23 00 90 00");
        execute("00 CB A0 00 04 5C 02 DF 1F 00 ",
                "DF 1F 81 8D 01 6D 73 63 70 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 A0 00 00 00 00 00 00 00 00 00 00 00 63 61 72 64 69 64 00 00 00 00 00 20 DF 00 00 12 A0 00 00 00 00 00 00 00 00 00 00 00 63 61 72 64 61 70 70 73 00 00 00 21 DF 00 00 10 A0 00 00 00 00 00 00 00 00 00 00 00 63 61 72 64 63 66 00 00 00 00 00 22 DF 00 00 10 A0 00 00 6D 73 63 70 00 00 00 00 00 63 6D 61 70 66 69 6C 65 00 00 00 23 DF 00 00 10 A0 00 00 90 00 ");
        execute("00 CB A0 10 04 5C 02 DF 22 00 ",
                "DF 22 06 00 00 00 00 00 00 90 00");
        execute("00 CB A0 00 04 5C 02 DF 1F 00 ",
                "DF 1F 81 8D 01 6D 73 63 70 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 A0 00 00 00 00 00 00 00 00 00 00 00 63 61 72 64 69 64 00 00 00 00 00 20 DF 00 00 12 A0 00 00 00 00 00 00 00 00 00 00 00 63 61 72 64 61 70 70 73 00 00 00 21 DF 00 00 10 A0 00 00 00 00 00 00 00 00 00 00 00 63 61 72 64 63 66 00 00 00 00 00 22 DF 00 00 10 A0 00 00 6D 73 63 70 00 00 00 00 00 63 6D 61 70 66 69 6C 65 00 00 00 23 DF 00 00 10 A0 00 00 90 00");
        execute("00 CB A0 10 04 5C 02 DF 23 00 ",
                "DF 23 00 90 00 ");
        execute("00 CB A0 00 04 5C 02 DF 1F 00 ",
                "DF 1F 81 8D 01 6D 73 63 70 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 A0 00 00 00 00 00 00 00 00 00 00 00 63 61 72 64 69 64 00 00 00 00 00 20 DF 00 00 12 A0 00 00 00 00 00 00 00 00 00 00 00 63 61 72 64 61 70 70 73 00 00 00 21 DF 00 00 10 A0 00 00 00 00 00 00 00 00 00 00 00 63 61 72 64 63 66 00 00 00 00 00 22 DF 00 00 10 A0 00 00 6D 73 63 70 00 00 00 00 00 63 6D 61 70 66 69 6C 65 00 00 00 23 DF 00 00 10 A0 00 00 90 00");
        execute("00 CB A0 10 04 5C 02 DF 23 00", "DF 23 00 90 00");
    }

    @Test
    public void importOneRSA2048Key() {
        authenticatePin();
        execute("00 DB A0 10 09 DF 22 06 00 00 00 00 01 00");
        execute("00 DB A0 10 59 DF 23 56 32 00 35 00 37 00 66 00 30 00 33 00 36 00 32 00 2D 00 32 00 65 00 65 00 37 00 2D 00 34 00 34 00 66 00 35 00 2D 00 39 00 38 00 38 00 35 00 2D 00 33 00 36 00 66 00 61 00 34 00 39 00 30 00 66 00 33 00 30 00 63 00 31 00 00 00 00 00 00 00 00 00 01 00 00 00 00 00");
        execute("00 DB A0 10 09 DF 22 06 00 00 00 00 02 00");
        execute("00 DB A0 10 59 DF 23 56 32 00 35 00 37 00 66 00 30 00 33 00 36 00 32 00 2D 00 32 00 65 00 65 00 37 00 2D 00 34 00 34 00 66 00 35 00 2D 00 39 00 38 00 38 00 35 00 2D 00 33 00 36 00 66 00 61 00 34 00 39 00 30 00 66 00 33 00 30 00 63 00 31 00 00 00 00 00 00 00 00 00 03 00 00 00 00 00");
        execute("00 DB A0 10 09 DF 22 06 00 00 01 00 02 00");
        // create keyfile
        execute("00 E0 00 00 49 62 47 82 01 18 83 02 B0 81 8C 05 8F 10 10 10 00 A5 37 B8 09 80 01 07 83 01 81 95 01 40 B8 09 80 01 87 83 01 81 95 01 40 B8 09 80 01 47 83 01 81 95 01 40 B6 09 80 01 17 83 01 81 95 01 40 B6 09 80 01 57 83 01 81 95 01 40");
        execute("00 44 00 00");
        // put the key
        execute("10 DB 3F FF F0 70 82 04 B7 84 01 81 A5 82 04 B0 83 01 02 84 01 00 87 82 04 A6 30 82 04 A2 02 01 00 02 82 01 01 00 AE A1 7E EC 31 7D 53 86 0E CD 2D F7 1A E0 62 5B CD 06 F9 A3 A2 33 48 72 C3 17 07 F3 26 2E F6 33 91 C5 18 90 EC 8E AD 77 6D C5 7B 74 4B 6C 1F D6 43 C4 4E 65 D5 19 2B 9A 69 63 9A FF 95 E7 03 D6 E8 F8 83 1E A0 6B BD 29 71 00 A8 FE 98 2C 8D 6F DB 40 27 AA C3 5A F5 D3 13 AC F5 04 75 90 8E F1 5F 64 AE 53 EC 43 12 CC 51 74 3F 40 F4 F3 0B DF B0 28 CA 9D 1D 34 B4 A1 0C BE E8 BD 2C 23 40 3C 90 7B 21 B7 5D D2 DD F0 2A 73 34 62 2D CE 6E 40 FE 39 31 CD D2 DB 97 DD 63 21 6D 61 BB 9A A1 7E F7 CC 90 0E C8 C9 E0 79 CF CA 46 1F 67 48 28 66 73 80 7E 92 7B 9D 7E 80 3A 80 D6 15 8D 7C 62 ED 6A 1B BC BF 1B DD D1 7A 7C 26 59 FB C6 8F DB");
        execute("10 DB 3F FF F0 0F 8E 56 A4 6F 58 5E D8 46 F6 2F 8A FE BD 36 30 EF 2C D9 81 37 AF 0D F4 CA D0 74 E8 9B E0 D9 A0 43 39 DF 7B CF 02 BE D9 92 8A 11 58 AB 73 FA A3 59 02 03 01 00 01 02 82 01 00 18 21 78 C8 6A 8E 46 DC 5F 6F 3A CA CA 8B F7 0B 78 69 5E 55 9E 34 37 EE A3 C6 AA F2 8E 74 2E D1 31 73 6A D1 9B DE 9B 59 C5 71 64 7D CD 6E 43 77 F8 25 48 30 0A 22 50 44 26 0B FD 7F 13 D7 B8 50 1A 21 3C FD 1E 6D C4 D5 D5 27 A2 32 8C 14 9B F6 B8 F5 44 85 F4 38 BD 7F 4D 58 B9 02 C4 BC 15 04 85 8A 04 0C D4 B8 F0 00 0B C1 64 7C 35 5C E0 67 28 90 7A 6E FB 7A 2C FB 94 27 4D 41 D6 B7 88 48 9B 61 0A 86 61 4F 35 94 D0 27 AB 34 A7 9D 2A 5D D8 25 27 E0 F0 6B 84 FB 7E 78 00 D6 3D 53 95 57 6A ED BC 86 A1 6F 41 28 88 63 98 22 F1 A5 C0 44 54 E4 33 23 7D 8D");
        execute("10 DB 3F FF F0 3B D9 53 5B 44 AE 60 F9 AF 4F 04 B2 BD 66 A5 CB 24 5A F0 70 6D F0 C5 40 23 17 0C 58 D3 C7 03 1B 4D 23 C5 F5 11 FA 50 18 7B 97 00 D6 06 D5 05 4D 11 85 89 02 AD 63 05 E5 6C 0E 24 D3 18 7F 2D C5 28 23 9F D6 F7 3F 49 15 BF 81 02 81 81 00 EC 89 4A 0F DA 9A 31 AE DD BD 74 9E 54 C7 BD 5C EE 6C D0 E3 E7 17 18 32 14 CC 10 3D 16 E6 DF 29 26 BA 5E 79 0E 18 84 FB BB D3 A5 3E AC 7B A1 36 F4 12 D7 A6 09 2A 9C EC 64 63 AC A1 38 D2 1D 01 78 E7 65 9C 26 2F 27 C6 C5 DF 8D 74 F3 70 8A 32 D3 CF 7B 82 D2 50 16 E7 16 40 45 67 E6 FF 8F 40 44 28 2D 12 D9 E6 C0 18 27 22 84 53 73 39 08 92 A3 CD 96 20 F4 BD 22 AE 99 6B 5D FB 36 DC 47 1F 02 81 81 00 BD 00 26 24 EA A3 AC 24 30 C4 5A 8D F1 D9 DB 8C 3E C0 9E 40 FA CB 21 64 A6 6E B6 4B 97 C2");
        execute("10 DB 3F FF F0 9C 08 03 95 26 27 6D 2F 05 C9 CB 40 CA 4D E8 AF FA B0 41 AC BF 21 58 A5 B9 97 06 61 3B 46 09 5B 1C F8 0A 7B BE 72 79 40 03 FD 4D 05 B6 C8 51 49 98 93 05 29 14 1F 70 48 30 AA 6A 8A 2F 71 B0 97 FF 52 BD CE F6 A8 8F 70 BC C4 00 D5 D4 4A 98 CF 1F BA F6 D3 8E 52 83 7B 37 18 2E 50 4B 79 0C 94 9E 87 02 81 80 2C A7 2E 48 17 E8 8C 00 8A F3 BD 14 36 C5 0E 46 80 EC 21 F3 24 29 03 F4 50 60 C5 A0 02 B6 CA E2 25 E1 80 FC 31 61 07 99 CE 37 82 36 76 B1 50 19 E3 B1 BA EC 29 46 D6 20 FA 42 A6 D0 38 BD D1 A3 F9 83 15 77 88 ED D6 00 7C 52 5B 8D FC 76 FE 5F E2 04 85 38 89 23 7D 6F 5A 8F FF 8A 41 DD 74 D9 99 04 4C 9E 06 6C BD 4E D1 F4 7E 2E 92 CD ED 84 61 4F EA 4B 86 68 3E 27 DF E6 98 F3 57 C3 F5 D9 02 81 80 7F 19 22 8D A0 DD 00 5E");
        execute("10 DB 3F FF F0 36 0D 55 78 2F 33 FA 58 8D BA AA B1 B7 F5 F2 36 E5 55 7E 71 C7 54 AF E9 13 BF B1 30 C2 53 E4 E8 97 2E B2 DD 41 A5 56 48 41 62 12 06 32 BE FF D7 78 0A DA F9 76 41 37 71 F6 5A D0 EF DA 6A 1A 44 B5 0F 2A A3 FB 46 2A BC 73 B3 F4 3C 50 1D BB DC 5E 59 1F 1E AD 4B 0A 00 72 74 43 9B 87 1A A1 56 8D D9 3E 32 0C 20 FD 8D 95 7F 1F 2E 8E 0C C6 38 14 AD 1A 94 04 C9 CC F1 02 81 80 7D E1 05 C6 30 D6 00 68 E4 45 B8 A2 C2 19 DF 30 DB 1D 5F 66 F0 FA EB 38 7C 90 99 AD 21 C1 50 05 EE 65 85 EB CC 88 5E DD CD FD 41 86 9C 91 B8 33 0D 5D 26 BB F0 FA 71 6D 1B 26 B0 85 2D 5B 26 15 C3 51 F4 7B 14 46 64 E7 B1 AD BC CF 3F BC 3D 6D 48 FE 0F 3F 4C CF C0 39 23 5A 50 B2 69 CB 78 21 62 28 51 F1 2C 41 CE AC E3 19 B1 2B 0A 66 BA 0B CA 9D 91 70 CC");
        execute("00 DB 3F FF 0B D9 B8 75 89 1C 44 9A BD F5 94 49");
        // update may files
        execute("00 DB A0 00 10 DF 20 0D 01 01 00 00 00 07 9A 81 B0 FF FF 00 00");
        execute("00 DB A0 10 09 DF 22 06 00 00 01 00 03 00");
        execute("00 DB A0 10 59 DF 23 56 32 00 35 00 37 00 66 00 30 00 33 00 36 00 32 00 2D 00 32 00 65 00 65 00 37 00 2D 00 34 00 34 00 66 00 35 00 2D 00 39 00 38 00 38 00 35 00 2D 00 33 00 36 00 66 00 61 00 34 00 39 00 30 00 66 00 33 00 30 00 63 00 31 00 00 00 00 00 00 00 00 00 03 00 00 00 00 08");
        // read the public key
        execute("00 CB 3F FF 0A 70 08 84 01 81 A5 03 7F 49 80 00",
                "7F 49 82 01 09 81 82 01 00 AE A1 7E EC 31 7D 53 86 0E CD 2D F7 1A E0 62 5B CD 06 F9 A3 A2 33 48 72 C3 17 07 F3 26 2E F6 33 91 C5 18 90 EC 8E AD 77 6D C5 7B 74 4B 6C 1F D6 43 C4 4E 65 D5 19 2B 9A 69 63 9A FF 95 E7 03 D6 E8 F8 83 1E A0 6B BD 29 71 00 A8 FE 98 2C 8D 6F DB 40 27 AA C3 5A F5 D3 13 AC F5 04 75 90 8E F1 5F 64 AE 53 EC 43 12 CC 51 74 3F 40 F4 F3 0B DF B0 28 CA 9D 1D 34 B4 A1 0C BE E8 BD 2C 23 40 3C 90 7B 21 B7 5D D2 DD F0 2A 73 34 62 2D CE 6E 40 FE 39 31 CD D2 DB 97 DD 63 21 6D 61 BB 9A A1 7E F7 CC 90 0E C8 C9 E0 79 CF CA 46 1F 67 48 28 66 73 80 7E 92 7B 9D 7E 80 3A 80 D6 15 8D 7C 62 ED 6A 1B BC BF 1B DD D1 7A 7C 26 59 FB C6 8F DB 0F 8E 56 A4 6F 58 5E D8 46 F6 2F 8A FE BD 36 30 EF 2C D9 81 37 AF 0D F4 CA D0 74 E8 9B E0 D9 A0 43 39 DF 7B CF 02 BE D9 61 0E");
        execute("00 C0 00 00 0E",
                "92 8A 11 58 AB 73 FA A3 59 82 03 01 00 01 90 00");
        // sign some data
        execute("00 22 41 B6 06 80 01 57 84 01 81");
        execute("00 2A 9E 9A 22 30 20 30 0C 06 08 2A 86 48 86 F7 0D 02 05 05 00 04 10 CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC 00");
        execute("00 22 41 B6 06 80 01 57 84 01 81");
        execute("00 2A 9E 9A 33 30 31 30 0D 06 09 60 86 48 01 65 03 04 02 01 05 00 04 20 CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC 00");
        execute("00 22 41 B6 06 80 01 57 84 01 81");
        execute("00 2A 9E 9A 23 30 21 30 09 06 05 2B 0E 03 02 1A 05 00 04 14 CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC 00");
        execute("00 22 41 B6 06 80 01 57 84 01 81");
        execute("00 2A 9E 9A 24 CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC CC 00");
        // decrypt some data and verify the decryption
        execute("00 22 41 B8 06 80 01 47 84 01 81");
        execute("10 2A 80 86 F0 3A 2F 91 1E 9A 76 FE F7 23 59 39 B5 BB A4 F6 F9 54 33 46 17 BA 34 7B EA 8E B5 6A AA B4 B0 D8 AA DE E1 0F 98 41 C2 85 36 B3 06 84 93 45 17 F5 63 59 5F 34 9B 94 4C D3 2A DF F7 35 FB F0 04 8A 95 13 E4 7C F9 D7 BA 61 E7 47 CB 42 AB 2B DA 99 19 15 EF 85 32 E6 EF 3C 29 D6 4F 46 A8 53 5C 71 BD 9B 15 A3 4C 01 3C D5 82 BA C8 0C 06 40 E6 09 69 A7 4C C9 4A 26 E6 73 0B A0 FD 17 0A 4F 70 AA 53 60 79 3D CB B7 D3 8B 93 3A B2 DD 63 98 49 DE D7 5B 56 BE 8C 2C 24 DE F1 64 E0 0F B4 69 60 12 A7 D3 FC 54 38 45 D7 25 68 B4 94 EA 67 1D 1C A3 FC 75 80 C5 3F B0 EF 17 DB 78 0B 7E 4F A2 7C FF 8D D5 A7 6D 03 58 F4 1D 85 4C 5C 61 7D 01 11 5E 7F 8D BF D9 A0 67 08 92 08 F5 C1 69 EF 42 8B BD 52 19 99 69 CE 06 8B F4 33 48 FC 1C D3 26 28 77 E6");
        execute("00 2A 80 86 10 44 DA 76 E1 C5 99 14 91 0A A6 93 8F 55 49 03 26 00", "74 65 73 74 31 32 33 34 35 36 37 38 39 30 00 00 00 00 00 00 90 00");

        deauthenticate();
    }

}
