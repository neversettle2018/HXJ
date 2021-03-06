USE [master]
GO
/****** Object:  Database [TS]    Script Date: 06/29/2018 13:07:22 ******/
CREATE DATABASE [TS] ON  PRIMARY 
( NAME = N'TS', FILENAME = N'd:\Program Files\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\TS.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'TS_log', FILENAME = N'd:\Program Files\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\TS_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [TS] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [TS].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [TS] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [TS] SET ANSI_NULLS OFF
GO
ALTER DATABASE [TS] SET ANSI_PADDING OFF
GO
ALTER DATABASE [TS] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [TS] SET ARITHABORT OFF
GO
ALTER DATABASE [TS] SET AUTO_CLOSE OFF
GO
ALTER DATABASE [TS] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [TS] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [TS] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [TS] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [TS] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [TS] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [TS] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [TS] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [TS] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [TS] SET  DISABLE_BROKER
GO
ALTER DATABASE [TS] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [TS] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [TS] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [TS] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [TS] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [TS] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [TS] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [TS] SET  READ_WRITE
GO
ALTER DATABASE [TS] SET RECOVERY FULL
GO
ALTER DATABASE [TS] SET  MULTI_USER
GO
ALTER DATABASE [TS] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [TS] SET DB_CHAINING OFF
GO
USE [TS]
GO
/****** Object:  Table [dbo].[Users]    Script Date: 06/29/2018 13:07:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Users](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[UserName] [varchar](50) NULL,
	[UserPassword] [varchar](max) NULL,
	[UserPhone] [varchar](50) NULL,
	[Address] [varchar](150) NULL,
	[UserTrueName] [varchar](30) NULL,
 CONSTRAINT [PK_Users] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Users] ON
INSERT [dbo].[Users] ([Id], [UserName], [UserPassword], [UserPhone], [Address], [UserTrueName]) VALUES (3, N'123', N'Hfq4PAnyji2n24qX9M8Z8G1F4j862771amG6FDYlqhehbn7bSFQv0bQEUY+HEiMyaMFNqk5ntRJE
+D4EhqHuUCbEKGdC/A8JvT74wOk1LEAkNE7GIui+vsnnPuUgeZOXRm17r3SFab3NY7AexyVNObop
QI3vWxZOfCXuD/6r8KWwufpUJwuYupeZAm1wHpI0z8EEvcIdFDk5AlmD9kpe0b6Svh6I4L3FcQBA
s51ZMQ+xCBGZpGtOJ/05zN8by+WqnowNzF3Tz6v2WUUoJGr/BanDBSyio+VLbml380Ys+fmiZezy
ZP37LHpzTn908OnSscNLVu4w1So0e52qRVk7tA==', N'13699999999', NULL, NULL)
INSERT [dbo].[Users] ([Id], [UserName], [UserPassword], [UserPhone], [Address], [UserTrueName]) VALUES (4, N'施志鸿', N'D7D9rORr5zEHf8szJF+ceYa0w4WbLMDFTqmm7g+8/2tmbKCwuifDqcsv+fJDRd2dKS681LBChSxf
VqB3HmV2VqHGZYN/hMfnz1N07d2u5mTtPeohyGDTxuOCONkTCjGd3I39PhPiFceJBgkntNMRwPU4
TqoJLzhEnJz0mGxy/0qy86ImUpdFju2JTTsfMHBzBiq6IvmxFJvBRosV3i2+VqT62LZJ3zlODKCM
dNjWWQbrOtTK8Fn4hZX1y+oHbElvmrnRYI3RquEn07GaDL3qlvmtbImBJeRwQpVvGj8JpUf3QC+V
jr5Mt9eXdvKdG9DGGQMlBFZygMP7liENuw7KeQ==', N'13800138000', NULL, NULL)
SET IDENTITY_INSERT [dbo].[Users] OFF
/****** Object:  Table [dbo].[Comment]    Script Date: 06/29/2018 13:07:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Comment](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[UserName] [varchar](50) NULL,
	[U_Content] [varchar](150) NULL,
	[ReleaseTime] [date] NULL,
 CONSTRAINT [PK_Comment] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Comment] ON
INSERT [dbo].[Comment] ([Id], [UserName], [U_Content], [ReleaseTime]) VALUES (3, N'9999', N'啊实打实大师的', NULL)
INSERT [dbo].[Comment] ([Id], [UserName], [U_Content], [ReleaseTime]) VALUES (4, N'9999', N'比较好就不会结不结婚', NULL)
INSERT [dbo].[Comment] ([Id], [UserName], [U_Content], [ReleaseTime]) VALUES (7, N'123', N'dfgdfgdfgdffgdfgdfgdfgdfgdfg', NULL)
INSERT [dbo].[Comment] ([Id], [UserName], [U_Content], [ReleaseTime]) VALUES (9, N'456', N'asdjiaosdasdi', NULL)
SET IDENTITY_INSERT [dbo].[Comment] OFF
/****** Object:  Table [dbo].[Category]    Script Date: 06/29/2018 13:07:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Category](
	[CategoryId] [int] IDENTITY(1,1) NOT NULL,
	[CategoryName] [varchar](50) NULL,
 CONSTRAINT [PK_Tops] PRIMARY KEY CLUSTERED 
(
	[CategoryId] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Category] ON
INSERT [dbo].[Category] ([CategoryId], [CategoryName]) VALUES (1, N'精品')
INSERT [dbo].[Category] ([CategoryId], [CategoryName]) VALUES (2, N'工装衣')
INSERT [dbo].[Category] ([CategoryId], [CategoryName]) VALUES (3, N'工装裤')
SET IDENTITY_INSERT [dbo].[Category] OFF
/****** Object:  Table [dbo].[Admin]    Script Date: 06/29/2018 13:07:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Admin](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[AdminId] [varchar](50) NOT NULL,
	[AdminPas] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Admin] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Admin] ON
INSERT [dbo].[Admin] ([Id], [AdminId], [AdminPas]) VALUES (1, N'123', N'123')
SET IDENTITY_INSERT [dbo].[Admin] OFF
/****** Object:  Table [dbo].[OrderInfo]    Script Date: 06/29/2018 13:07:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[OrderInfo](
	[OrderNo] [varchar](50) NOT NULL,
	[UserId] [int] NOT NULL,
	[OrderUserName] [varchar](50) NULL,
	[Address] [varchar](150) NULL,
	[Phone] [varchar](20) NULL,
	[OrderTime] [datetime] NULL,
	[IsSent] [int] NULL,
	[OrderStatus] [varchar](50) NULL,
 CONSTRAINT [PK_OrderInfo] PRIMARY KEY CLUSTERED 
(
	[OrderNo] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[OrderInfo] ([OrderNo], [UserId], [OrderUserName], [Address], [Phone], [OrderTime], [IsSent], [OrderStatus]) VALUES (N'1530161002053', 4, N'施志鸿', N'广东省清远市清城区学贤路省职教大学城内广东岭南职业技术学院', N'13800138000', CAST(0x0000A90D00D1A214 AS DateTime), 0, N'待发货')
INSERT [dbo].[OrderInfo] ([OrderNo], [UserId], [OrderUserName], [Address], [Phone], [OrderTime], [IsSent], [OrderStatus]) VALUES (N'1530161164829', 4, N'黄晓杰', N'广东省清远市清城区学贤路省职教大学城内广东岭南职业技术学院', N'13800138000', CAST(0x0000A90D00D2632D AS DateTime), 0, N'待发货')
INSERT [dbo].[OrderInfo] ([OrderNo], [UserId], [OrderUserName], [Address], [Phone], [OrderTime], [IsSent], [OrderStatus]) VALUES (N'1530161319060', 4, N'邱金东', N'广东省清远市清城区学贤路省职教大学城内广东岭南职业技术学院', N'13800138000', CAST(0x0000A90D00D31916 AS DateTime), 0, N'待发货')
INSERT [dbo].[OrderInfo] ([OrderNo], [UserId], [OrderUserName], [Address], [Phone], [OrderTime], [IsSent], [OrderStatus]) VALUES (N'1530161462069', 4, N'潘子超', N'广东省清远市清城区学贤路省职教大学城内广东岭南职业技术学院', N'13800138000', CAST(0x0000A90D00D3BF81 AS DateTime), 0, N'待发货')
INSERT [dbo].[OrderInfo] ([OrderNo], [UserId], [OrderUserName], [Address], [Phone], [OrderTime], [IsSent], [OrderStatus]) VALUES (N'1530168881983', 4, N'黄晓杰', N'广东省清远市', N'13800138000', CAST(0x0000A90D00F5B58B AS DateTime), 0, N'待发货')
INSERT [dbo].[OrderInfo] ([OrderNo], [UserId], [OrderUserName], [Address], [Phone], [OrderTime], [IsSent], [OrderStatus]) VALUES (N'1530186610477', 4, N'施志鸿', N'广东', N'13800138000', CAST(0x0000A90D0146DF77 AS DateTime), 0, N'待发货')
INSERT [dbo].[OrderInfo] ([OrderNo], [UserId], [OrderUserName], [Address], [Phone], [OrderTime], [IsSent], [OrderStatus]) VALUES (N'1530187083773', 4, N'施志鸿', N'广东', N'13800138000', CAST(0x0000A90D0149056C AS DateTime), 0, N'待发货')
INSERT [dbo].[OrderInfo] ([OrderNo], [UserId], [OrderUserName], [Address], [Phone], [OrderTime], [IsSent], [OrderStatus]) VALUES (N'1530187088526', 4, N'施志鸿', N'广东', N'13800138000', CAST(0x0000A90D01490C2A AS DateTime), 0, N'已发货')
/****** Object:  Table [dbo].[OrderDetail]    Script Date: 06/29/2018 13:07:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[OrderDetail](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[OrderNo] [varchar](50) NOT NULL,
	[GoodsId] [int] NULL,
	[GoodsName] [varchar](50) NULL,
	[GoodsNum] [int] NULL,
	[Price] [varchar](50) NULL,
	[GoodsSize] [varchar](10) NULL,
 CONSTRAINT [PK_OrderDetail_1] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[OrderDetail] ON
INSERT [dbo].[OrderDetail] ([Id], [OrderNo], [GoodsId], [GoodsName], [GoodsNum], [Price], [GoodsSize]) VALUES (16, N'1530161002053', 4, N'测试工装裤子拿取库存信息', 1, N'248', NULL)
INSERT [dbo].[OrderDetail] ([Id], [OrderNo], [GoodsId], [GoodsName], [GoodsNum], [Price], [GoodsSize]) VALUES (17, N'1530161164829', 4, N'测试工装裤子拿取库存信息', 1, N'248', NULL)
INSERT [dbo].[OrderDetail] ([Id], [OrderNo], [GoodsId], [GoodsName], [GoodsNum], [Price], [GoodsSize]) VALUES (18, N'1530161319060', 4, N'测试工装裤子拿取库存信息', 1, N'248', NULL)
INSERT [dbo].[OrderDetail] ([Id], [OrderNo], [GoodsId], [GoodsName], [GoodsNum], [Price], [GoodsSize]) VALUES (19, N'1530161319060', 4, N'测试工装裤子拿取库存信息', 1, N'248', NULL)
INSERT [dbo].[OrderDetail] ([Id], [OrderNo], [GoodsId], [GoodsName], [GoodsNum], [Price], [GoodsSize]) VALUES (20, N'1530168881983', 4, N'测试工装裤子拿取库存信息', 1, N'248', NULL)
INSERT [dbo].[OrderDetail] ([Id], [OrderNo], [GoodsId], [GoodsName], [GoodsNum], [Price], [GoodsSize]) VALUES (21, N'1530168940873', 4, N'测试工装裤子拿取库存信息', 1, N'248', NULL)
INSERT [dbo].[OrderDetail] ([Id], [OrderNo], [GoodsId], [GoodsName], [GoodsNum], [Price], [GoodsSize]) VALUES (22, N'1530186610477', 4, N'测试工装裤子拿取库存信息', 1, N'248', N'XXL')
INSERT [dbo].[OrderDetail] ([Id], [OrderNo], [GoodsId], [GoodsName], [GoodsNum], [Price], [GoodsSize]) VALUES (23, N'1530187260047', 4, N'测试工装裤子拿取库存信息', 1, N'248', N'XL')
SET IDENTITY_INSERT [dbo].[OrderDetail] OFF
/****** Object:  Table [dbo].[ShoppingCart]    Script Date: 06/29/2018 13:07:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[ShoppingCart](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[UserId] [int] NULL,
	[GoodsId] [int] NULL,
	[GoodsPrice] [varchar](50) NULL,
	[GoodsNum] [int] NULL,
	[ImageUrl] [varchar](150) NULL,
	[GoodsName] [varchar](50) NULL,
	[GoodsSize] [varchar](10) NULL,
 CONSTRAINT [PK_ShoppingCart] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[OtherAddress]    Script Date: 06/29/2018 13:07:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[OtherAddress](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[UserId] [int] NULL,
	[UserAddress] [varchar](500) NULL,
	[PostCode] [varchar](50) NULL,
	[Tel] [varchar](20) NULL,
	[UserTrueName] [varchar](50) NULL,
 CONSTRAINT [PK_OtherAddress] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Trousers]    Script Date: 06/29/2018 13:07:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Trousers](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[TrousersId] [varchar](50) NOT NULL,
	[Price] [varchar](50) NULL,
	[GoodsName] [varchar](50) NULL,
	[CategoryId] [int] NULL,
 CONSTRAINT [PK_Trousers] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Trousers] ON
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (1, N'o_1.png', N'99', N'子裤子精品精品！！！', 3)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (2, N'o_2.png', N'258', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 3)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (3, N'o_3.png', N'208', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 3)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (4, N'o_4.png', N'358', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 3)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (5, N'o_5.png', N'298', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 3)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (6, N'o_6.png', N'248', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 3)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (7, N'o_6.png', N'248', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 3)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (8, N'o_6.png', N'248', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 3)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (9, N'o_6.png', N'248', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 3)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (10, N'o_6.png', N'248', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 3)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (11, N'o_6.png', N'248', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 3)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (12, N'o_6.png', N'248', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 3)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (13, N'o_6.png', N'248', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 3)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (14, N'a_1.png', N'208', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 2)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (15, N'a_2.png', N'248', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 2)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (16, N'a_3.png', N'358', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 2)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (17, N'a_4.png', N'248', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 2)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (18, N'a_5.png', N'358', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 2)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (19, N'a_6.png', N'248', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 2)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (20, N'q_1.png', N'208', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 1)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (21, N'p_2.png', N'248', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 1)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (22, N'p_3.png', N'358', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 1)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (23, N'p_4.png', N'208', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 1)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (24, N'p_5.png', N'358', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 1)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (25, N'p_6.png', N'248', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 1)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (26, N'p_6.png', N'208', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 1)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (27, N'a_6.png', N'248', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 2)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (28, N'p_6.png', N'248', N'测试工装裤子拿取库存信息', 1)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (29, N'p_6.png', N'248', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 1)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (30, N'p_6.png', N'248', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 1)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (31, N'p_6.png', N'248', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 1)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (32, N'p_6.png', N'248', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 1)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (33, N'p_6.png', N'248', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 1)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (37, N'background.jpg', N'111', N'111', 1)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (38, N'background.jpg', N'1111', N'111', 1)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (40, N'background.jpg', N'333', N'333', 1)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (41, N'background.jpg', N'444', N'44', 1)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (42, N'background.jpg', N'1111111111111', N'11111111', 3)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (43, N'1s3.jpg', N'222', N'222', 2)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (44, N'background.jpg', N'22', N'222', 2)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (46, N'o_1.png', N'337', N'超级无敌帅的衣服衣服裤子裤子精品精品！！！', 3)
INSERT [dbo].[Trousers] ([Id], [TrousersId], [Price], [GoodsName], [CategoryId]) VALUES (47, N'删 除.png', N'99', N'子裤子精品精品！！！', 3)
SET IDENTITY_INSERT [dbo].[Trousers] OFF
/****** Object:  Table [dbo].[Stock]    Script Date: 06/29/2018 13:07:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Stock](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[GoodsId] [int] NULL,
	[Size] [varchar](10) NULL,
	[SizeNum] [bigint] NULL,
 CONSTRAINT [PK_SizeStock] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Stock] ON
INSERT [dbo].[Stock] ([Id], [GoodsId], [Size], [SizeNum]) VALUES (1, 28, N'M', 100)
INSERT [dbo].[Stock] ([Id], [GoodsId], [Size], [SizeNum]) VALUES (2, 28, N'L', 100)
INSERT [dbo].[Stock] ([Id], [GoodsId], [Size], [SizeNum]) VALUES (3, 28, N'S', 100)
INSERT [dbo].[Stock] ([Id], [GoodsId], [Size], [SizeNum]) VALUES (4, 28, N'XL', 200)
INSERT [dbo].[Stock] ([Id], [GoodsId], [Size], [SizeNum]) VALUES (5, 28, N'XXL', 223)
SET IDENTITY_INSERT [dbo].[Stock] OFF
/****** Object:  Table [dbo].[GoodsComment]    Script Date: 06/29/2018 13:07:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[GoodsComment](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[UserName] [varchar](50) NULL,
	[ReleaseTime] [date] NULL,
	[GoodsId] [int] NULL,
	[U_Content] [varchar](150) NULL,
 CONSTRAINT [PK_GoodsComment] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Default [DF_OrderInfo_IsSent]    Script Date: 06/29/2018 13:07:23 ******/
ALTER TABLE [dbo].[OrderInfo] ADD  CONSTRAINT [DF_OrderInfo_IsSent]  DEFAULT ((0)) FOR [IsSent]
GO
/****** Object:  Default [DF_OrderInfo_OrderStatus]    Script Date: 06/29/2018 13:07:23 ******/
ALTER TABLE [dbo].[OrderInfo] ADD  CONSTRAINT [DF_OrderInfo_OrderStatus]  DEFAULT ('待发货') FOR [OrderStatus]
GO
/****** Object:  ForeignKey [FK_OtherAddress_Users]    Script Date: 06/29/2018 13:07:23 ******/
ALTER TABLE [dbo].[OtherAddress]  WITH CHECK ADD  CONSTRAINT [FK_OtherAddress_Users] FOREIGN KEY([UserId])
REFERENCES [dbo].[Users] ([Id])
GO
ALTER TABLE [dbo].[OtherAddress] CHECK CONSTRAINT [FK_OtherAddress_Users]
GO
/****** Object:  ForeignKey [FK_Trousers_Category]    Script Date: 06/29/2018 13:07:23 ******/
ALTER TABLE [dbo].[Trousers]  WITH CHECK ADD  CONSTRAINT [FK_Trousers_Category] FOREIGN KEY([CategoryId])
REFERENCES [dbo].[Category] ([CategoryId])
GO
ALTER TABLE [dbo].[Trousers] CHECK CONSTRAINT [FK_Trousers_Category]
GO
/****** Object:  ForeignKey [FK_Stock_Trousers]    Script Date: 06/29/2018 13:07:23 ******/
ALTER TABLE [dbo].[Stock]  WITH CHECK ADD  CONSTRAINT [FK_Stock_Trousers] FOREIGN KEY([GoodsId])
REFERENCES [dbo].[Trousers] ([Id])
GO
ALTER TABLE [dbo].[Stock] CHECK CONSTRAINT [FK_Stock_Trousers]
GO
/****** Object:  ForeignKey [FK_GoodsComment_Trousers]    Script Date: 06/29/2018 13:07:23 ******/
ALTER TABLE [dbo].[GoodsComment]  WITH CHECK ADD  CONSTRAINT [FK_GoodsComment_Trousers] FOREIGN KEY([GoodsId])
REFERENCES [dbo].[Trousers] ([Id])
GO
ALTER TABLE [dbo].[GoodsComment] CHECK CONSTRAINT [FK_GoodsComment_Trousers]
GO
