.class public Lcom/ss/android/downloadlib/addownload/compliance/e$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/downloadlib/addownload/compliance/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/ss/android/downloadlib/addownload/compliance/e$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/ss/android/downloadlib/addownload/compliance/e$b;->a:I

    return p0
.end method

.method static synthetic b(Lcom/ss/android/downloadlib/addownload/compliance/e$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/ss/android/downloadlib/addownload/compliance/e$b;->b:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/e$b;->a:I

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/e$b;->b:Ljava/lang/String;

    return-void
.end method
