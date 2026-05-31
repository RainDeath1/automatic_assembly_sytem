load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "learn_bazel",
    srcs = glob(["src/main/java/com/example/*.java"]),
    main_class = "com.example.App",
    deps = ["@maven//:org_apache_commons_commons_lang3"],
)