.class Lcom/ss/android/downloadlib/g/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/downloadlib/g/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field private static a:Lcom/ss/android/downloadlib/g/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ss/android/downloadlib/g/l;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ss/android/downloadlib/g/l;-><init>(Lcom/ss/android/downloadlib/g/l$1;)V

    sput-object v0, Lcom/ss/android/downloadlib/g/l$a;->a:Lcom/ss/android/downloadlib/g/l;

    return-void
.end method

.method static synthetic a()Lcom/ss/android/downloadlib/g/l;
    .locals 1

    sget-object v0, Lcom/ss/android/downloadlib/g/l$a;->a:Lcom/ss/android/downloadlib/g/l;

    return-object v0
.end method
