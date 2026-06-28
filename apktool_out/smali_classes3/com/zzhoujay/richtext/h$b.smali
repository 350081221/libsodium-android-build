.class Lcom/zzhoujay/richtext/h$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zzhoujay/richtext/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# static fields
.field private static final a:Lcom/zzhoujay/richtext/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zzhoujay/richtext/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zzhoujay/richtext/h;-><init>(Lcom/zzhoujay/richtext/h$a;)V

    sput-object v0, Lcom/zzhoujay/richtext/h$b;->a:Lcom/zzhoujay/richtext/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Lcom/zzhoujay/richtext/h;
    .locals 1

    sget-object v0, Lcom/zzhoujay/richtext/h$b;->a:Lcom/zzhoujay/richtext/h;

    return-object v0
.end method
