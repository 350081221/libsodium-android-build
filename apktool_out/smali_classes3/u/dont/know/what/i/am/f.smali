.class public final Lu/dont/know/what/i/am/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Z = false

.field private static b:Lu/dont/know/what/i/am/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu/dont/know/what/i/am/s;

    invoke-direct {v0}, Lu/dont/know/what/i/am/s;-><init>()V

    sput-object v0, Lu/dont/know/what/i/am/f;->b:Lu/dont/know/what/i/am/r;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lu/dont/know/what/i/am/r;
    .locals 1

    .line 1
    sget-object v0, Lu/dont/know/what/i/am/f;->b:Lu/dont/know/what/i/am/r;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lu/dont/know/what/i/am/s;

    .line 7
    .line 8
    invoke-direct {v0}, Lu/dont/know/what/i/am/s;-><init>()V

    .line 9
    .line 10
    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static b()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public static c()Z
    .locals 1

    sget-boolean v0, Lu/dont/know/what/i/am/f;->a:Z

    return v0
.end method

.method public static d()Z
    .locals 1

    sget-boolean v0, Lu/dont/know/what/i/am/f;->a:Z

    return v0
.end method
