.class public Lcom/ss/android/downloadlib/addownload/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/downloadlib/addownload/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field private static a:Lcom/ss/android/downloadlib/addownload/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ss/android/downloadlib/addownload/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ss/android/downloadlib/addownload/f;-><init>(Lcom/ss/android/downloadlib/addownload/f$1;)V

    sput-object v0, Lcom/ss/android/downloadlib/addownload/f$a;->a:Lcom/ss/android/downloadlib/addownload/f;

    return-void
.end method

.method static synthetic a()Lcom/ss/android/downloadlib/addownload/f;
    .locals 1

    sget-object v0, Lcom/ss/android/downloadlib/addownload/f$a;->a:Lcom/ss/android/downloadlib/addownload/f;

    return-object v0
.end method
