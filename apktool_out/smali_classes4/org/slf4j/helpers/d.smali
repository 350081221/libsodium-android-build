.class public Lorg/slf4j/helpers/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static d:Lorg/slf4j/helpers/d;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/Throwable;

.field private c:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/slf4j/helpers/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/slf4j/helpers/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/slf4j/helpers/d;->d:Lorg/slf4j/helpers/d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v0}, Lorg/slf4j/helpers/d;-><init>(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lorg/slf4j/helpers/d;->a:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lorg/slf4j/helpers/d;->b:Ljava/lang/Throwable;

    if-nez p3, :cond_0

    .line 5
    iput-object p2, p0, Lorg/slf4j/helpers/d;->c:[Ljava/lang/Object;

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p2}, Lorg/slf4j/helpers/d;->d([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lorg/slf4j/helpers/d;->c:[Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method static d([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    array-length v0, p0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    new-array v1, v0, [Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static {p0, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 13
    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "non-sensical empty or null argument array"

    .line 19
    .line 20
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method


# virtual methods
.method public a()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lorg/slf4j/helpers/d;->c:[Ljava/lang/Object;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/slf4j/helpers/d;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lorg/slf4j/helpers/d;->b:Ljava/lang/Throwable;

    return-object v0
.end method
