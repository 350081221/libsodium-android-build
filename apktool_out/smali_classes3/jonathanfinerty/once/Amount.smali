.class public Ljonathanfinerty/once/Amount;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(II)Z
    .locals 0

    invoke-static {p0, p1}, Ljonathanfinerty/once/Amount;->f(II)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(II)Z
    .locals 0

    invoke-static {p0, p1}, Ljonathanfinerty/once/Amount;->d(II)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(II)Z
    .locals 0

    invoke-static {p0, p1}, Ljonathanfinerty/once/Amount;->e(II)Z

    move-result p0

    return p0
.end method

.method private static synthetic d(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static synthetic e(II)Z
    .locals 0

    if-ge p1, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static exactly(I)Ljonathanfinerty/once/CountChecker;
    .locals 1

    new-instance v0, Ljonathanfinerty/once/b;

    invoke-direct {v0, p0}, Ljonathanfinerty/once/b;-><init>(I)V

    return-object v0
.end method

.method private static synthetic f(II)Z
    .locals 0

    if-le p1, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static lessThan(I)Ljonathanfinerty/once/CountChecker;
    .locals 1

    new-instance v0, Ljonathanfinerty/once/a;

    invoke-direct {v0, p0}, Ljonathanfinerty/once/a;-><init>(I)V

    return-object v0
.end method

.method public static moreThan(I)Ljonathanfinerty/once/CountChecker;
    .locals 1

    new-instance v0, Ljonathanfinerty/once/c;

    invoke-direct {v0, p0}, Ljonathanfinerty/once/c;-><init>(I)V

    return-object v0
.end method
