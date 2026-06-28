.class public Lcom/umeng/analytics/pro/cr;
.super Lcom/umeng/analytics/pro/bx;
.source "SourceFile"


# static fields
.field public static final a:I = 0x0

.field public static final b:I = 0x1

.field public static final c:I = 0x2

.field public static final d:I = 0x3

.field public static final e:I = 0x4

.field public static final f:I = 0x5

.field private static final h:J = 0x1L


# instance fields
.field protected g:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/umeng/analytics/pro/bx;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/umeng/analytics/pro/cr;->g:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/umeng/analytics/pro/bx;-><init>()V

    .line 4
    iput p1, p0, Lcom/umeng/analytics/pro/cr;->g:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 5
    invoke-direct {p0, p2}, Lcom/umeng/analytics/pro/bx;-><init>(Ljava/lang/String;)V

    .line 6
    iput p1, p0, Lcom/umeng/analytics/pro/cr;->g:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 15
    invoke-direct {p0, p2, p3}, Lcom/umeng/analytics/pro/bx;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    iput p1, p0, Lcom/umeng/analytics/pro/cr;->g:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/Throwable;)V
    .locals 0

    .line 9
    invoke-direct {p0, p2}, Lcom/umeng/analytics/pro/bx;-><init>(Ljava/lang/Throwable;)V

    .line 10
    iput p1, p0, Lcom/umeng/analytics/pro/cr;->g:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/bx;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 8
    iput p1, p0, Lcom/umeng/analytics/pro/cr;->g:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1, p2}, Lcom/umeng/analytics/pro/bx;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    .line 14
    iput p1, p0, Lcom/umeng/analytics/pro/cr;->g:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/bx;-><init>(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    .line 12
    iput p1, p0, Lcom/umeng/analytics/pro/cr;->g:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/umeng/analytics/pro/cr;->g:I

    return v0
.end method
