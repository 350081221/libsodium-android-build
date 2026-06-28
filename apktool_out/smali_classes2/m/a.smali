.class public Lm/a;
.super Lg1/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lg1/a;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method

.method public static e(Lg1/a;)Lm/a;
    .locals 5

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lm/a;

    invoke-virtual {p0}, Lg1/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lg1/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lg1/a;->c()J

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lm/a;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    return-object v0
.end method
