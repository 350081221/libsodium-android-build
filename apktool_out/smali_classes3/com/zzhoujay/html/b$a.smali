.class Lcom/zzhoujay/html/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zzhoujay/html/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field private static final a:Lorg/ccil/cowan/tagsoup/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/ccil/cowan/tagsoup/h;

    invoke-direct {v0}, Lorg/ccil/cowan/tagsoup/h;-><init>()V

    sput-object v0, Lcom/zzhoujay/html/b$a;->a:Lorg/ccil/cowan/tagsoup/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Lorg/ccil/cowan/tagsoup/h;
    .locals 1

    sget-object v0, Lcom/zzhoujay/html/b$a;->a:Lorg/ccil/cowan/tagsoup/h;

    return-object v0
.end method
