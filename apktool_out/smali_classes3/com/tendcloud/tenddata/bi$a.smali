.class Lcom/tendcloud/tenddata/bi$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/bi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field private static instance:Lcom/tendcloud/tenddata/bi;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/tendcloud/tenddata/bi;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/tendcloud/tenddata/bi;-><init>(Lcom/tendcloud/tenddata/bi$1;)V

    sput-object v0, Lcom/tendcloud/tenddata/bi$a;->instance:Lcom/tendcloud/tenddata/bi;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000()Lcom/tendcloud/tenddata/bi;
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/bi$a;->instance:Lcom/tendcloud/tenddata/bi;

    return-object v0
.end method
