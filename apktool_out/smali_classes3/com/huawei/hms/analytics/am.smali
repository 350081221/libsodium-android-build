.class public interface abstract Lcom/huawei/hms/analytics/am;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ikl:Ljava/util/regex/Pattern;

.field public static final klm:Ljava/util/regex/Pattern;

.field public static final lmn:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "^[a-zA-Z0-9_-]+(\\s+[a-zA-Z0-9_-]+)*$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/huawei/hms/analytics/am;->lmn:Ljava/util/regex/Pattern;

    const-string v0, "[a-zA-Z_][a-zA-Z0-9_]*|[\\$][a-zA-Z0-9]*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/huawei/hms/analytics/am;->klm:Ljava/util/regex/Pattern;

    const-string v0, "[a-zA-Z][a-zA-Z0-9_]*|[\\$][a-zA-Z0-9]*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/huawei/hms/analytics/am;->ikl:Ljava/util/regex/Pattern;

    return-void
.end method
