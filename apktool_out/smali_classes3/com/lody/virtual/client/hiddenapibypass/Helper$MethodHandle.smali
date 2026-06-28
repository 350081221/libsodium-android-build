.class public Lcom/lody/virtual/client/hiddenapibypass/Helper$MethodHandle;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hiddenapibypass/Helper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MethodHandle"
.end annotation


# instance fields
.field protected final artFieldOrMethod:J

.field private cachedSpreadInvoker:Lcom/lody/virtual/client/hiddenapibypass/Helper$MethodHandle;

.field protected final handleKind:I

.field private nominalType:Ljava/lang/invoke/MethodType;

.field private final type:Ljava/lang/invoke/MethodType;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/lody/virtual/client/hiddenapibypass/Helper$MethodHandle;->type:Ljava/lang/invoke/MethodType;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/lody/virtual/client/hiddenapibypass/Helper$MethodHandle;->handleKind:I

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    iput-wide v0, p0, Lcom/lody/virtual/client/hiddenapibypass/Helper$MethodHandle;->artFieldOrMethod:J

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
