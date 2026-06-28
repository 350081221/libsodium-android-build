.class Lcom/zzhoujay/html/c$m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zzhoujay/html/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "m"
.end annotation


# instance fields
.field private final a:I


# direct methods
.method private constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/zzhoujay/html/c$m;->a:I

    return-void
.end method

.method synthetic constructor <init>(ILcom/zzhoujay/html/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zzhoujay/html/c$m;-><init>(I)V

    return-void
.end method

.method static synthetic a(Lcom/zzhoujay/html/c$m;)I
    .locals 0

    iget p0, p0, Lcom/zzhoujay/html/c$m;->a:I

    return p0
.end method
