.class public final synthetic Lcom/airbnb/lottie/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/airbnb/lottie/f1;


# direct methods
.method public synthetic constructor <init>(Lcom/airbnb/lottie/f1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/airbnb/lottie/e1;->a:Lcom/airbnb/lottie/f1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/e1;->a:Lcom/airbnb/lottie/f1;

    invoke-static {v0}, Lcom/airbnb/lottie/f1;->a(Lcom/airbnb/lottie/f1;)V

    return-void
.end method
