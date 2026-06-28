.class public Lcom/airbnb/lottie/utils/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/airbnb/lottie/a1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/airbnb/lottie/utils/e;

    invoke-direct {v0}, Lcom/airbnb/lottie/utils/e;-><init>()V

    sput-object v0, Lcom/airbnb/lottie/utils/f;->a:Lcom/airbnb/lottie/a1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/airbnb/lottie/utils/f;->a:Lcom/airbnb/lottie/a1;

    invoke-interface {v0, p0}, Lcom/airbnb/lottie/a1;->debug(Ljava/lang/String;)V

    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lcom/airbnb/lottie/utils/f;->a:Lcom/airbnb/lottie/a1;

    invoke-interface {v0, p0, p1}, Lcom/airbnb/lottie/a1;->debug(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lcom/airbnb/lottie/utils/f;->a:Lcom/airbnb/lottie/a1;

    invoke-interface {v0, p0, p1}, Lcom/airbnb/lottie/a1;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static d(Lcom/airbnb/lottie/a1;)V
    .locals 0

    sput-object p0, Lcom/airbnb/lottie/utils/f;->a:Lcom/airbnb/lottie/a1;

    return-void
.end method

.method public static e(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/airbnb/lottie/utils/f;->a:Lcom/airbnb/lottie/a1;

    invoke-interface {v0, p0}, Lcom/airbnb/lottie/a1;->a(Ljava/lang/String;)V

    return-void
.end method

.method public static f(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lcom/airbnb/lottie/utils/f;->a:Lcom/airbnb/lottie/a1;

    invoke-interface {v0, p0, p1}, Lcom/airbnb/lottie/a1;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
