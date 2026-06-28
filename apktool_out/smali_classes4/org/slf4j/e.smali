.class public Lorg/slf4j/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static a:Lorg/slf4j/IMarkerFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, Lorg/slf4j/impl/StaticMarkerBinder;->SINGLETON:Lorg/slf4j/impl/StaticMarkerBinder;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/slf4j/impl/StaticMarkerBinder;->getMarkerFactory()Lorg/slf4j/IMarkerFactory;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/slf4j/e;->a:Lorg/slf4j/IMarkerFactory;
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catch_0
    move-exception v0

    .line 11
    const-string v1, "Unexpected failure while binding MarkerFactory"

    .line 12
    .line 13
    invoke-static {v1, v0}, Lorg/slf4j/helpers/l;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catch_1
    new-instance v0, Lorg/slf4j/helpers/c;

    .line 18
    .line 19
    invoke-direct {v0}, Lorg/slf4j/helpers/c;-><init>()V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lorg/slf4j/e;->a:Lorg/slf4j/IMarkerFactory;

    .line 23
    .line 24
    :goto_0
    return-void
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
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lorg/slf4j/d;
    .locals 1

    sget-object v0, Lorg/slf4j/e;->a:Lorg/slf4j/IMarkerFactory;

    invoke-interface {v0, p0}, Lorg/slf4j/IMarkerFactory;->c(Ljava/lang/String;)Lorg/slf4j/d;

    move-result-object p0

    return-object p0
.end method

.method public static b()Lorg/slf4j/IMarkerFactory;
    .locals 1

    sget-object v0, Lorg/slf4j/e;->a:Lorg/slf4j/IMarkerFactory;

    return-object v0
.end method

.method public static c(Ljava/lang/String;)Lorg/slf4j/d;
    .locals 1

    sget-object v0, Lorg/slf4j/e;->a:Lorg/slf4j/IMarkerFactory;

    invoke-interface {v0, p0}, Lorg/slf4j/IMarkerFactory;->a(Ljava/lang/String;)Lorg/slf4j/d;

    move-result-object p0

    return-object p0
.end method
